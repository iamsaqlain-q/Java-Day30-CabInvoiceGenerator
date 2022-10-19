package com.bl.invoice.generator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.cab.invoice.generator.InvoiceGenerator;
import com.bl.cab.invoice.generator.Ride;

class TestInvoiceGenerator {

	@Test
	public void givenDistanceAndTime_InvoiceGenerator_ShouldReturnFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 5.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(55, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTimeLessThanMinimum_InvoiceGenerator_ShouldReturnFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnAggregateFare() {
	InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	Ride[] rides = {new Ride(5.0, 5), new Ride(0.1, 1)};
	double fare = invoiceGenerator.calculateFare(rides);
	assertEquals(30, fare, 0.0);
	
	}
}
