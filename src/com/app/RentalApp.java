package com.app;

import java.util.Scanner;

import com.service.RentalService;
import com.serviceimpln.RentalServiceImpln;

public class RentalApp {

	public static void main(String[] args) {
     System.out.println("=======Welcome to Room Rental Application======");
     RentalService r1= new RentalServiceImpln();
     Scanner ip=new Scanner(System.in);
     while(true) {
    	 System.out.println("=========Menu=========");
    	 System.out.println("1.Info\n2.Rooms Available\n3.Check In\n4.Check Out\n5.Customer DEtails\n6.Exit");
    	 System.out.println("Enter your option:-");
    	 int op=ip.nextInt();
    	 switch(op) {
    	 case 1:r1.info();;break;
    	 case 2:r1.RoomsAvailable();break;
    	 case 3:r1.CheckIn();break;
    	 case 4:r1.CheckOut();break;
    	 case 5:r1.customerDetails();break;
    	 case 6:System.out.println("======Thank You Visit Again=====");
    	         System.exit(0);
    	 default:System.out.println("Invalid options:-");
    	 }
     }
	}

}
