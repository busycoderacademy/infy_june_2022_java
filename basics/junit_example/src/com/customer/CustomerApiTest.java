package com.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerApiTest {

	private CustomerApi customerApi;
	
	@BeforeEach
	public void beforeEach() {
		customerApi=new CustomerApi();
	}
	
	//performance test: test method should not take more then 2sec
	@Test
	void getCustomerByIdTest() {
		Customer customer=Assertions.assertTimeout
				(Duration.ofMillis(2000), ()-> customerApi.getCustomerById(1));
	}
	
	@Test
	void getCustomerByIdNotFoundTest() {
		CustomerNotFoundException exception = Assertions
				.assertThrows(CustomerNotFoundException.class, ()-> customerApi.getCustomerById(22));
		
		Assertions.assertEquals("customer with id 22 is not found", exception.getMessage());
	}
	
	@AfterEach
	public void afterEach() {
		customerApi=null;
	}
	

}
