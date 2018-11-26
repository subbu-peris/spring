package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	//Connect to DB and get Value
	/* (non-Javadoc)
	 * @see com.demo.repository.CustomerRepository#findAll()
	 */
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
