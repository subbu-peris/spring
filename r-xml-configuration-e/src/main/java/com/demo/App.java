package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.CustomerService;

public class App {
	public static void main(String[] args) {
		//Getting rid of the hard coded instance.
//	CustomerService service = new CustomerServiceImpl();
//		System.out.println(service.findAll().get(0).getFirstname());
//		System.out.println(service.findAll().get(0).getLastname());
		
		//Implementing Spring
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService.findAll().get(0).getFirstname());
		System.out.println(customerService.findAll().get(0).getLastname());
	}
}
