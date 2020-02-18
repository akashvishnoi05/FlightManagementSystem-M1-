package com.capg.fms.DAO;
import java.util.*;

import com.capg.fms.DTO.Flight;
import com.capg.fms.util.Repository;

public class FlightDaoImpl {
	public List<Flight> ft=Repository.getFlight();
	
	public Flight addFlight(Flight flight) {
		
		return flight;
		
	}
	public Flight viewFlight(long flightNumber)
	{
		for(Flight flightobj:ft)
		{
			if(flightobj.getFlightNumber()==flightNumber) 
			{
				return flightobj;
			}
		}
		return null;
	
	}
	public List<Flight> viewFlightDao()
	{
		return ft;
	}
	public Flight modifyFlight(Flight flightdata)
	{ 
		for(Flight flightobj:ft)
		{
			if(flightobj.getFlightNumber()==flightdata.getFlightNumber())
			{
				flightobj.getFlightModel().replace(flightobj.getFlightModel(), flightdata.getFlightModel());
				flightobj.setCarrierName(flightdata.getCarrierName());
				flightobj.setSeatCapacity(flightdata.getSeatCapacity());
				return flightobj;
			}
		}
		
		return null;
	}
	public void deleteFlight(int flightNumber)
	{
		
		for(Flight flightobj:ft)
		{
			if(flightobj.getFlightNumber()==flightNumber)
			{
				ft.remove(flightobj);
			}
		}
	}
	
	
 
	
}
