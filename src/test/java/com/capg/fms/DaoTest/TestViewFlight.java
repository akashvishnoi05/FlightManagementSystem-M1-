package com.capg.fms.DaoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capg.fms.DTO.Flight;
import com.capg.fms.Service.FlightServiceImpl;
import com.capg.fms.util.Repository;


public class TestViewFlight {

	List<Flight> flightdata = Repository.getFlight();
	FlightServiceImpl FSobj = new FlightServiceImpl();
	@Test
	public void viewFlightService()
	{
		assertEquals(flightdata,FSobj.viewFlightServices());
	}
	
	@Test
	public void viewFlightServices()
	{
		Throwable e = assertThrows(Exception.class,new Executable() {
			public void execute() throws Throwable {
				FSobj.viewFlightService(12365);
			}
		});
		assertEquals("no data found", e.getMessage());
	}
	
	@Test
	public void viewFlightServices1()
	{
		Throwable e = assertThrows(Exception.class,new Executable() {
			public void execute() throws Throwable {
				FSobj.viewFlightService(0);
			}
		});
		assertEquals("flight number cannot be zero", e.getMessage());
	}
}
