package com.simplilearn.workshop.Customer;

import java.util.List;

import com.simplilearn.workshop.model.Customer;
import com.simplilearn.workshop.repository.CustomerRepository;
import com.simplilearn.workshop.repository.InMemoryCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new InMemoryCustomerRepositoryImpl();
	@Override
	public List<Customer> retrieveAllCustomers(){
		return customerRepository.findAll();
	}

}
