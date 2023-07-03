package org.weewelchie.strava.stats.http;

import org.apache.hc.core5.http.HttpStatus;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.weewelchie.strava.stats.beans.Athlete;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
public class StravaHttpClient {

    private final String GET_ATHLETE_BY_ACCESS_TOKEN;
    private final String GET_ATHLETE_STATS;

    private final String GET_ATHLETE_ACTIVITIES;
    private final String GET_DETAILED_ACTIVITY;

    private final String ACCESS_TOKEN = "d3222b7e8841c1dc085456663ac5bd100acdf763";
    private final String ACCESS_TOKEN_PRIVATE = "b0a2e78a8afbca60cc94b58800a6f71ceebf4fb9";

    private final String ACCESS_TOKEN_DETAIL = "a1b222e6db763e2572f08b1699b6e16930dfd3dc";

    private final Integer NUM_ACTIVITIES = 50;

    public StravaHttpClient() {
        GET_ATHLETE_BY_ACCESS_TOKEN = "https://www.strava.com/api/v3/athlete?access_token=";
        GET_ATHLETE_STATS = "https://www.strava.com/api/v3/athletes/";
        GET_ATHLETE_ACTIVITIES = "https://www.strava.com/api/v3/athlete/activities/";
        GET_DETAILED_ACTIVITY = "https://www.strava.com/api/v3/activities/";
    }

    public static void main(String[] args) throws Exception {

        StravaHttpClient strava = new StravaHttpClient();
        Athlete athlete = strava.getAthleteByAccessToken();
        Integer athleteID = athlete.getId();
        System.out.println("Athlete details: " + athlete);

        JSONObject athleteStats = strava.getAthleteStats(athleteID);
        System.out.println("Athlete Stats: " + athleteStats);

        JSONArray athleteActivities = strava.getAthleteActivities();
        System.out.println("Detailed Athlete Activities: " + athleteActivities);
        ArrayList<String> ids = new ArrayList<String>();
        for(int i=0;i<athleteActivities.length();i++)
        {
            JSONObject obj =athleteActivities.getJSONObject(i);
            //JSONObject obj = new JSONObject(athleteActivities.get(i));
            if (!obj.isNull("id")) {
                ids.add(obj.get("id").toString());
            }
        }

        System.out.println("Ids: " + ids);
        JSONArray details= strava.getDetailedAthleteActivities(ids);
        for(int i =0;i< details.length();i++)
        {
            JSONObject obj = (JSONObject) details.get(i);
            System.out.println("Activity: \nName: " + obj.get("name") + " \nDistance: " + obj.get("distance") + " \nDescription: " + obj.get("description"));
        }
    }

    public Athlete getAthleteByAccessToken() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create(this.GET_ATHLETE_BY_ACCESS_TOKEN + this.ACCESS_TOKEN))
                .GET()
                .headers("accept","application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        if (response.statusCode() == HttpStatus.SC_OK) {
         //Convert to StravaAthlete Object
            JSONObject json = new JSONObject(response.body());
            byte[] jsonData = json.toString().getBytes();

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(
                    DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Athlete athlete = mapper.readValue(jsonData, Athlete.class);
            return athlete;
        }
        else {
            System.err.println("Error: " + response.body());
            return null;
        }
    }

    public JSONObject getAthleteStats(Integer id) throws IOException, InterruptedException {
        //{{ATHLETE_ID}}/stats?access_token={{ACCESS_TOKEN}}
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create(this.GET_ATHLETE_STATS + id + "/stats?access_token=" + this.ACCESS_TOKEN))
                .GET()
                .headers("accept","application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        if (response.statusCode() == HttpStatus.SC_OK)
            return new JSONObject(response.body());
        else{
            System.err.println("Error: " + response.body());
            return null;
        }
    }

    public JSONArray getAthleteActivities() throws IOException, InterruptedException {
        //?per_page=30&access_token={{ACCESS_TOKEN_PRIVATE}}

        //URI.create(this.GET_ATHLETE_ACTIVITIES + "?access_token=" + this.ACCESS_TOKEN_PRIVATE)
        URI uri = URI.create("https://www.strava.com/api/v3/athlete/activities?per_page="+ this.NUM_ACTIVITIES + "&access_token=" + this.ACCESS_TOKEN_DETAIL);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(uri)
                .GET()
                .headers("accept","application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        String responseBody = response.body();

        if (response.statusCode() == HttpStatus.SC_OK)
            return new JSONArray(response.body());
        else{
            System.err.println("Error: " + response.body());
            return null;
        }
    }


    public JSONArray getDetailedAthleteActivities(List<String> ids) throws IOException, InterruptedException {
        //{{ACTIVITY_ID}}?include_all_efforts=true&access_token={{ACCESS_TOKEN_PRIVATE}}

        JSONArray activities = new JSONArray();
        URI uri;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request;

        int responseStatusCode;
        for(String id:ids)
        {
            System.out.println("Getting Activity details id: " + id);
            uri = URI.create(this.GET_DETAILED_ACTIVITY + id + "?include_all_efforts=true&access_token=" + this.ACCESS_TOKEN_DETAIL);

            request = HttpRequest.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .uri(uri)
                    .GET()
                    .headers("accept","application/json")
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            if(response.statusCode() != HttpStatus.SC_OK)
            {
                System.err.println("Error: " + response.body());
                break;
            }
            else
            {
                activities.put(new JSONObject(response.body()));
            }

        }

        return activities;
    }


    public static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        HttpRequest request = HttpRequest.newBuilder(new URI("http://jsonplaceholder.typicode.com/posts"))
                .version(HttpClient.Version.HTTP_2)
                .POST(BodyPublishers.ofString("Sample Post Request"))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String responseBody = response.body();
        System.out.println("httpPostRequest : " + responseBody);
    }

    public static void asynchronousGetRequest() throws URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        URI httpURI = new URI("http://jsonplaceholder.typicode.com/posts/1");
        HttpRequest request = HttpRequest.newBuilder(httpURI)
                .version(HttpClient.Version.HTTP_2)
                .build();
        CompletableFuture<Void> futureResponse = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAccept(resp -> {
                    System.out.println("Got pushed response " + resp.uri());
                    System.out.println("Response statuscode: " + resp.statusCode());
                    System.out.println("Response body: " + resp.body());
                });
        System.out.println("futureResponse" + futureResponse);

    }

    public static void asynchronousMultipleRequests() throws URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        List<URI> uris = Arrays.asList(new URI("http://jsonplaceholder.typicode.com/posts/1"), new URI("http://jsonplaceholder.typicode.com/posts/2"));
        List<HttpRequest> requests = uris.stream()
                .map(HttpRequest::newBuilder)
                .map(reqBuilder -> reqBuilder.build())
                .collect(Collectors.toList());
        System.out.println("Got pushed response1 " + requests);
        CompletableFuture.allOf(requests.stream()
                        .map(request -> client.sendAsync(request, BodyHandlers.ofString()))
                        .toArray(CompletableFuture<?>[]::new))
                .thenAccept(System.out::println)
                .join();
    }

    public static void pushRequest() throws URISyntaxException, InterruptedException {
        System.out.println("Running HTTP/2 Server Push example...");

        HttpClient httpClient = HttpClient.newBuilder()
                .version(Version.HTTP_2)
                .build();

        HttpRequest pageRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.golang.org/serverpush"))
                .build();

        // Interface HttpResponse.PushPromiseHandler<T>
        // void applyPushPromise​(HttpRequest initiatingRequest, HttpRequest pushPromiseRequest, Function<HttpResponse.BodyHandler<T>,​CompletableFuture<HttpResponse<T>>> acceptor)
        httpClient.sendAsync(pageRequest, BodyHandlers.ofString(), pushPromiseHandler())
                .thenAccept(pageResponse -> {
                    System.out.println("Page response status code: " + pageResponse.statusCode());
                    System.out.println("Page response headers: " + pageResponse.headers());
                    String responseBody = pageResponse.body();
                    System.out.println(responseBody);
                }).join();

        Thread.sleep(1000); // waiting for full response
    }

    private static PushPromiseHandler<String> pushPromiseHandler() {
        return (HttpRequest initiatingRequest,
                HttpRequest pushPromiseRequest,
                Function<HttpResponse.BodyHandler<String>,
                        CompletableFuture<HttpResponse<String>>> acceptor) -> {
            acceptor.apply(BodyHandlers.ofString())
                    .thenAccept(resp -> {
                        System.out.println(" Pushed response: " + resp.uri() + ", headers: " + resp.headers());
                    });
            System.out.println("Promise request: " + pushPromiseRequest.uri());
            System.out.println("Promise request: " + pushPromiseRequest.headers());
        };
    }

}
