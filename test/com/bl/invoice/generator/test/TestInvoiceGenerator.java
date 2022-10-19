package com.bl.invoice.generator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.cab.invoice.generator.InvoiceGenerator;

class TestInvoiceGenerator {

	@Test
	public void givenDistanceAndTime_InvoiceGenerator_ShouldReturnFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 5.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(55, fare, 0.0);
	}

}
