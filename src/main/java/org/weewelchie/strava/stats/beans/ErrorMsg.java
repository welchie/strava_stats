package org.weewelchie.strava.stats.beans;

import java.io.Serializable;

public class ErrorMsg implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMsg = "";
	
	public ErrorMsg(String msg)
	{
		this.setErroMsg(msg);
	}

	public void setErroMsg(String msg)
	{
		this.errorMsg= msg;
	}
	
	public String getErrorMsg()
	{
		return this.errorMsg;
	}
	
	
}
