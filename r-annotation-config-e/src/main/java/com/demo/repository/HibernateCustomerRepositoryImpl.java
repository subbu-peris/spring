package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository("customerRepository")
//@Repository("customerRepositoryRepo")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Gary");
		customer.setLastname("Charles");
		
		customers.add(customer);
		
		return customers;
	}
}
