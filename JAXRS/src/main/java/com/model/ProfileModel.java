package com.model;

public class ProfileModel {
public ProfileModel()
{
	
}
	public ProfileModel(String name, Long id, String country) {
		super();
		this.name = name;
		this.id = id;
		this.country = country;
	}
	String name;
	Long id;
	String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
