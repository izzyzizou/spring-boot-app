package com.userinfo.code;

public class Address {
	private String identifier;
	private String street;
	private String city;
	private String state;
	
	protected Address() {
	}
	
	public Address(String identifier, String street, String city, String state) {
		this.identifier = identifier;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}	
}
