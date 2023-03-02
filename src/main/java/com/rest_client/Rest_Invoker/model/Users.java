package com.rest_client.Rest_Invoker.model;

import java.io.Serializable;

public class Users implements Serializable {
	
	private int id;
	private String name;
	private String type;
	private String location;
	private String avatar_url;
	private String url;
	
	public Users() {
		super();

	}

	public Users(int id, String name, String type, String location, String avatar_url, String url) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.location = location;
		this.avatar_url = avatar_url;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
	
}
