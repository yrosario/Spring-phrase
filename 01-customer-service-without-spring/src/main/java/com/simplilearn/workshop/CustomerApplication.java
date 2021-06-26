package com.simplilearn.workshop;

import java.util.List;

import com.simplilearn.workshop.Customer.CustomerService;
import com.simplilearn.workshop.Customer.CustomerServiceImpl;
import com.simplilearn.workshop.model.Customer;

public class CustomerApplication {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		List<Customer> list_of_customers = customerService.retrieveAllCustomers();
		
		list_of_customers.forEach(customer -> System.out.println(customer.getName()));

	}

}
