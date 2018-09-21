package com.service.model;

public class Address {
	private String streetAddress;
	private String state;
	private String pincode;

	public Address() {
	}

	public Address(String streetAddress, String state, String pincode) {
		super();
		this.streetAddress = streetAddress;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
