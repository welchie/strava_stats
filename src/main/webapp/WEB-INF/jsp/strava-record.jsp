<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.weewelchie.strava.stats.StravaData"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Strava Record</title>
    </head>
    <body>
    <% 
        if (request.getAttribute("stravaData") != null) {
        	StravaData stravaData = (StravaData) request.getAttribute("stravaData");
    %>
 
    <h1>Strava Data</h1>
    <div>ID: <%= stravaData.getId()%></div>
    <div>Name: <%= stravaData.getName()%></div>
    <div>Description: <%= stravaData.getDesc()%></div>
        
    <% 
        } else { 
    %>
 
    <h1>No Strava record found.</h1>
         
    <% } %>	
    
    <form name="backForm" action="/strava-stats" method="POST">
          <button type="submit">Back</button>
    </form>
    </body>
</html>