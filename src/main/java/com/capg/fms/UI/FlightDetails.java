package com.capg.fms.UI;

import java.util.List;
import java.util.Scanner;

import com.capg.fms.DTO.Flight;
import com.capg.fms.Exceptions.MyException;
import com.capg.fms.Service.FlightServiceImpl;
import com.capg.fms.util.Repository;

public class FlightDetails {

	public static void main(String[] args) {
		new Repository();
		char ch;
		FlightServiceImpl flightServiceobj=new FlightServiceImpl();
		do
		{
			System.out.println("enter ur choice");
			System.out.println("1. Add a new flight");
			System.out.println("2. modify the flight");
			System.out.println("3. view flight");
			System.out.println("4 view all the details of flight");
			System.out.println("5.delete flight");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:flightServiceobj.addFlight(new Flight(11231,"ABCDE","XYZ0",25));
				break;
				case 3:
					try
					{
					Flight flightobj=flightServiceobj.viewFlightService(12355);
					System.out.println(flightobj.getFlightNumber()+" "+flightobj.getFlightModel()+" "+flightobj.getSeatCapacity()+" "+flightobj.getCarrierName());
					}
					catch(MyException e)
					{
						System.out.println(e.getMessage());
					}
					break;
				case 4: 
						List<Flight> flight=flightServiceobj.viewFlightServices();
						for(Flight flightobj:flight)
						{
							System.out.println(flightobj.getFlightNumber()+" "+flightobj.getFlightModel()+" "+flightobj.getCarrierName()+" "+flightobj.getSeatCapacity());
						    
						}
		
					break;
				case 2:
					Flight flightuser = flightServiceobj.modifyFlight(new Flight(12355,"ABCDE","XYZ0",25));
					//System.out.println(flightuser.getFlightNumber()+" "+flightuser.getCarrierName()+" "+flightuser.getFlightModel()+" "+flightuser.getSeatCapacity());
					break;
				case 5:
					try
					{
						flightServiceobj.deleteFlight(12365);
					}
					
					catch(MyException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
			}
				System.out.println("do want to operate more Y|N?");
				ch=sc.next().charAt(0);
				
			
		}while(ch=='y'|| ch=='Y');
		
		
		

	}

}
