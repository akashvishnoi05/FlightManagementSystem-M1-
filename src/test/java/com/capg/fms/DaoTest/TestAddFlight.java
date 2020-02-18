package com.capg.fms.DaoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.capg.fms.DTO.Flight;
import com.capg.fms.Service.FlightServiceImpl;
import com.capg.fms.util.Repository;


public class TestAddFlight {

	List<Flight> flightdata = Repository.getFlight();
	FlightServiceImpl FSobj = new FlightServiceImpl();
	@Test
	public void viewFlightService()
	{
		assertEquals(flightdata,FSobj.viewFlightServices());
	}
}
