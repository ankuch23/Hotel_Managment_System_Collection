package com.entity;

public class Address {
	private String houseNo;
	private String state;
	private int pincode;
	
	public Address(String houseNo,String state, int pincode) {
		this.houseNo = houseNo;	
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
