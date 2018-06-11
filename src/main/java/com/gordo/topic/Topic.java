package com.gordo.topic;

public class Topic {

	private String id;
	private String name;
	private String description;
	private int year;
	private Boolean available;
	
	public Topic() {
		
	}

	public Topic(String id, String name, String description, int year, Boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.year = year;
		this.available = available;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
	
}
