package com.capg.fms.Service;
import java.util.ArrayList;
import java.util.List;

import com.capg.fms.DAO.FlightDaoImpl;
import com.capg.fms.DTO.Flight;
import com.capg.fms.Exceptions.MyException;
import com.capg.fms.util.Repository;
 
public class FlightServiceImpl {
	FlightDaoImpl flightdaoobj=new FlightDaoImpl();
	public List<Flight> flightlist=Repository.getFlight();
	public boolean addFlight(Flight ft)	
	{ 
		Flight adddata = flightdaoobj.addFlight(ft);
		boolean addflight = flightlist.add(adddata);
		return addflight;
	}
	
	public Flight viewFlightService(int flightNumber) throws MyException 
	{
		if(flightNumber==0)
		{
			throw new MyException("flight number cannot be zero");
		}
		Flight flightobj=flightdaoobj.viewFlight(flightNumber);
		if(flightobj==null)
		{
			throw new MyException("no data found");
		}
		return flightobj;
		
	}
	public List<Flight> viewFlightServices()	
	{
		List <Flight> flightlist=flightdaoobj.viewFlightDao();
		return flightlist;
		
	}
	public Flight modifyFlight(Flight ft)
	{
		Flight updateddata = flightdaoobj.modifyFlight(ft);
		return updateddata;
	}
	public void deleteFlight(int flightNumber) throws MyException
	{
		if(flightNumber==0)
		{
			throw new MyException("flight number cannot be zero");
		}
		else
		{
			flightdaoobj.deleteFlight(flightNumber);
		}
	}
	
	
	
	

}
