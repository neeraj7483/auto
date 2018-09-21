package com.service.model;

public class Customer {
	private String customerId;
	private String name;
	private String password;
	private String email;
	private String location;
	private String contactNo;
	private Address address;

	public Customer() {
	}

	public Customer(String customerId, String name, String password, String email, String location, String contactNo,
			Address address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.location = location;
		this.contactNo = contactNo;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", password=" + password + ", location="
				+ location + ", contactNo=" + contactNo + ", address=" + address + "]";
	}

}
