package com.example.spring;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;



@Service



public class CustomerService {
	@Autowired

	private CustomerRepository dao;

	//private static ArrayList<Customer> customerdatabase=new ArrayList<Customer>();
	public Customer addcustomer(Customer customer)
	{
		/*customer.setCid(363);
		customerdatabase.add(customer);
		return customer;*/
		Customer createdCustomer=dao.save(customer);
		return createdCustomer;
	}
	public ArrayList<Customer> fetchCustomers(){
		//return customerdatabase;
		return (ArrayList<Customer>) dao.findAll();
	}
	
	
	
	
	
	public Customer fetchCustomer(int id)
	{
		/*
		return customerdatabase.stream()
				.filter(customer->customer.getCid()==id)
				.findAny().get();
		*/
		
		java.util.Optional<Customer> option=dao.findById(id);
		if(option.isPresent())
		{
			return option.get();
		}
		
		else
			return null;
	}
	public Customer updateCustomer(int id,LocalDate dob)
	{
		Customer customer=fetchCustomer(id);
		if(customer!=null)
		{
			customer.setDob(dob);
			return dao.save(customer);
		}
		else
		{
			return null;
			
		}
	}
}
