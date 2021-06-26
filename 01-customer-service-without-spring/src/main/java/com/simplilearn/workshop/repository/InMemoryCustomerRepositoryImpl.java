package com.simplilearn.workshop.repository;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.workshop.model.Customer;

public class InMemoryCustomerRepositoryImpl implements CustomerRepository {

	private static List<Customer> customers_list = new ArrayList<Customer>();
	
	//Add three customers
	static {
		customers_list.add(new Customer(101L, "vinodh", "vinodh@pibotal.com", "23423234"));
		customers_list.add(new Customer(102L, "bhavya", "bhavya@mindtree.com", "2343242344"));
		customers_list.add(new Customer(101L, "samarth", "samarth@pibotal.com", "23423234"));
	}
	
	@Override
	public List<Customer> findAll(){
		return customers_list;
	}
}
