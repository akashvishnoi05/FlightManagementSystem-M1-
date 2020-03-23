package com.capg.fms.util; 
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capg.fms.DTO.*;
public class Repository {
	
	//public void addData() {
		
	//flight data 	
	static List<Flight> flightinfo = new CopyOnWriteArrayList<Flight>();
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

	

}
