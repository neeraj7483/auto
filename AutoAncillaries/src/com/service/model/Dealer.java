package com.service.model;

public class Dealer {
	private String dealerId;
	private String name;
	private String password;
	private String email;
	private String location;
	private String contactNo;
	private Address address;
	private int rating;

	public Dealer() {
	}

	public Dealer(String dealerId, String name, String password, String email, String location, String contactNo,
			Address address, int rating) {
		super();
		this.dealerId = dealerId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.location = location;
		this.contactNo = contactNo;
		this.address = address;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Dealer [DealerId=" + dealerId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", location=" + location + ", contactNo=" + contactNo + ", address=" + address + "]";
	}

}
