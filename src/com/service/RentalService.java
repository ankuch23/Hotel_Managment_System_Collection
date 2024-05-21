package com.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.entity.Customer;

public interface RentalService {
	
	ArrayList<Customer> l1=new ArrayList<Customer>();
	LinkedHashMap<Integer,Customer> nac=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> ac=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> deluxe=new LinkedHashMap<Integer,Customer>();
	
	void info();
	void RoomsAvailable();
	void CheckIn();
	void CheckOut();
	void customerDetails();
	//find customerbyid  ......find cutsomerbyroomtype
}
