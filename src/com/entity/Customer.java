package com.entity;

public class Customer {
	
	private String cname;
	private long phno;
	private int age;
	private Address a;
	private String roomtype;
	private double roomPrice;
	private int roomNo;
	
	

	public Customer(String cname, long phno, int age, Address a, String roomtype, double roomPrice,
			int roomNo) {
		super();
		this.cname = cname;
		this.phno = phno;
		this.age = age;
		this.a = a;
		this.roomtype = roomtype;
		this.roomPrice = roomPrice;
		this.roomNo = roomNo;
	}

	public String getCname() {
		return cname;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", phno=" + phno + ", age=" + age + ", a=" + a
				+ ", roomtype=" + roomtype + ", roomPrice=" + roomPrice + ", roomNo=" + roomNo + "]";
	}

	
	
	

}
