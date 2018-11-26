package com.demo.service;

import java.util.List;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

//	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {

	}
	
	//constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("Constructor Injection!");
		this.customerRepository = customerRepository;
	}

	//setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection!");
		this.customerRepository = customerRepository;
	}
	//setter injection
	public void setCustomerRepositoryBean(CustomerRepository customerRepository) {
		System.out.println("Setter Injection 1!");
		this.customerRepository = customerRepository;
	}
	
	//autowire byType variation (the setter can be different from the bean name in the bean definition)
	//this does not work for autowire by Name
/*	public void setCustomerRepositoryAutowireByType(CustomerRepository customerRepository) {
		System.out.println("Setter Injection AutowireByType!");
		this.customerRepository = customerRepository;
	}*/
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
