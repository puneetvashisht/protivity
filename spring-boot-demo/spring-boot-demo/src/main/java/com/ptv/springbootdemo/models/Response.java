package com.ptv.springbootdemo.models;

public class Response {
	
	String message;
	Boolean auth;
	
	
	
	public Response() {
		super();
	}
	public Response(String message, Boolean auth) {
		super();
		this.message = message;
		this.auth = auth;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getAuth() {
		return auth;
	}
	public void setAuth(Boolean auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Response [message=" + message + ", auth=" + auth + "]";
	}
	
	
	
	
	
	

}
