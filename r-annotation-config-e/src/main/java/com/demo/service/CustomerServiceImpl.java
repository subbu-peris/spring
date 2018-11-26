package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	//autowiring member or field
//	@Autowired
	private CustomerRepository customerRepository;

// autowiring using constructor
/*	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("constructor");
		this.customerRepository = customerRepository;
	}*/

	// autowiring using property
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("property");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
