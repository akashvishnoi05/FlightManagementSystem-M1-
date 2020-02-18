package com.capg.fms.util; 
import java.util.*;

import com.capg.fms.DTO.*;
public class Repository {
	
	//public void addData() {
		
	//flight data 	
	static List<Flight> flightinfo = new ArrayList<Flight>();
	public Repository()
	{
	flightinfo.add(new Flight(12355,"BS2W2","ABCD",50));
	flightinfo.add(new Flight(12365,"BS2W3","EGGH",60));
	flightinfo.add(new Flight(12385,"BS2W4","IJKL",30));
	flightinfo.add(new Flight(12386,"BS2W5","MNOP",35));
	flightinfo.add(new Flight(12387,"BS2W6","QRST",48));
	flightinfo.add(new Flight(12388,"BS2W7","UVWX",58));
	flightinfo.add(new Flight(12389,"BS2W8","YZAB",60 ));
	}
	
	
	
	public static List<Flight> getFlight()
	{
		return flightinfo;
		
	}
	public static void setFlight(List<Flight> ft)
	{
		Repository.flightinfo=flightinfo;
	}

	
	
//	List<User> user = new ArrayList<User>(); 
//	user.add(new User("admin",11111,"John","@111#",999999999,"admin@gmail.com"));
//	user.add(new User("user",22222,"Johnwick","@kill#",999999999,"johnwick@gmail.com"));
//	user.add(new User("user",33333,"John Cena","@ucantseeme#",999999999,"johncena@gmail.com"));
//	
//	
//	
//	//password of user
//	List<Password> passwd = new ArrayList<Password>();
//	passwd.add(new Password("@111#"));
//	passwd.add(new Password("@kill#"));
//	passwd.add(new Password("@ucantseeme#"));
//	
//	//passenger detail
//	
//	List<Passenger> passenger = new ArrayList<Passenger>();
//	passenger.add(new Passenger(98765,"johnwick",31,1235,21.45));
//	passenger.add(new Passenger(98764,"wick",28,1265,30.45));
//	passenger.add(new Passenger(98765,"johnwick",25,1256,23.45));
//	
//	
//	
//	}
	
	

}
