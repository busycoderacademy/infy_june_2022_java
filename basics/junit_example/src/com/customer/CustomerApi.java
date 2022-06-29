package com.customer;

public class CustomerApi {

	public Customer getCustomerById(int id) {

		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			
		}
		/// intracting with data
		if (id == 1)
			return new Customer(6, "amit", 600000);
		else
			throw new CustomerNotFoundException("customer with id "+ id +" is not found");
	}
}
