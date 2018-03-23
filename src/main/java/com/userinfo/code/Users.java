package com.userinfo.code;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Users")
public class Users {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String imageUrl;
	private String mobileNumber;
	private int age;
	private CombinedAddress address;
	
	public Users() {
//		this.address = new ArrayList<>();
	}
	
	public Users(String firstName, String lastName, String middleName, String imageUrl, String mobileNumber, int age, CombinedAddress address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.imageUrl = imageUrl;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
//	public String getAddress() {
//		return address;
//	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public CombinedAddress getAddress(){
		return address;
	}
}
