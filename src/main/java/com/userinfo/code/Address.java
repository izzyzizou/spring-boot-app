package com.userinfo.code;

public class Address {
	private String street;
	private String city;
	private String state;
	private String dist;
	
	protected Address() {
	}
	
	public Address(String dist, String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.dist = dist;
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
	public String getDist() {
		return dist;
	}
}
