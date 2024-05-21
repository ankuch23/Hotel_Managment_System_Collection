package com.serviceimpln;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.entity.Address;
import com.entity.Customer;
import com.service.RentalService;

public class RentalServiceImpln implements RentalService {
	Scanner ip=new Scanner(System.in);
	
	{
		
	for(int i=101;i<=108;i++) {
		nac.put(i, null);
	}
	
	for(int i=201;i<205;i++) {
		ac.put(i, null);
	}
	
	for(int i=301;i<303;i++) {
		deluxe.put(i, null);
	}
	
	}

	@Override
	public void info() {
		System.out.println("===========Non Ac========");
		System.out.println("Fan");
		System.out.println("Tv");
		System.out.println("===================AC===========");
		System.out.println("AC");
		System.out.println("Tv");
		System.out.println("==============DELUXE===========");
		System.out.println("AC");
		System.out.println("Tv");
		System.out.println("3-4 memeber");
	}
	
	
	public void checkRooms(LinkedHashMap<Integer,Customer>m,String type) {
		System.out.println("======"+type+" Rooms:========");
		int c=0;
		for(Integer Roomno:m.keySet()) {
			if(m.get(Roomno)==null) {
				System.out.print(Roomno+" ");
				c++;
			}
		}
		System.out.println( );
		if(c==0) {
			System.out.println("Room not available");
		}
		
	}

	@Override
	public void RoomsAvailable() {
      		checkRooms(nac,"nonac");
      		checkRooms(ac,"ac");
      		checkRooms(deluxe,"deluxe");
	}
	
	public void allocate(LinkedHashMap<Integer,Customer> m,String roomtype,double roomprice) {
		
		System.out.println("Enter the roomno:- ");
		int roomno=ip.nextInt();
		
		if(m.containsKey(roomno) && m.get(roomno)==null) {
			System.out.println("Enter Customer Name:-");
			String cname=ip.next();
			System.out.println("Enter Customer Phno:-");
			long phno=ip.nextLong();
			System.out.println("Enter Customer Age:-");
			int age=ip.nextInt();
			System.out.println("Enter Customer houseNo:-");
			String hno=ip.next();
			System.out.println("Enter Customer state:-");
			String state=ip.next();
			System.out.println("Enter Customer pincode:-");
			int pncd=ip.nextInt();
			
			Customer c=new Customer(cname,phno,age,new Address(hno,state,pncd), roomtype, roomprice, roomno);
			m.put(roomno, c);
			l1.add(c);
			System.out.println();
		}
		
	}

	@Override
	public void CheckIn() {
		System.out.println("======check in===");
		System.out.println("1.nonac\n2.ac\n3.deluxe");
		System.out.println("Enter the option");
		int op=ip.nextInt();
		switch(op) {
		case 1:allocate(nac,"NonAc",2000);break;
		case 2:allocate(ac,"AC",2500);break;
		case 3:allocate(deluxe,"deluxe",3000);break;
		default:System.out.println("Invalid options");
		}
		
	}
	
	void deallocate(LinkedHashMap<Integer,Customer>m) {
		System.out.println("Enter the roomno:-");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)!=null) {
			Customer c=m.get(roomno);
			System.out.println(c.getCname()+" Thanks for visiting our hotel...."+c.getRoomNo());
			m.put(roomno, null);
		}
		else {
			System.out.println("Invalid Roomno....");
		}
	}

	@Override
	public void CheckOut() {
		System.out.println("========Check Out=======");
		System.out.println("1.Non Ac\n2.AC\n3.Deluxe");
		System.out.println("Enter the option:-");
		int op=ip.nextInt();
		switch(op) {
		case 1:deallocate(nac);break;
		case 2:deallocate(ac);break;
		case 3:deallocate(deluxe);break;
		default:System.out.println("Invalid option...");
		}
		
	}

	@Override
	public void customerDetails() {
		int c=0;
		System.out.println("=======Customer Details======");
		for(Customer ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Customer Data found");
		}
		
	}
	
	

}
