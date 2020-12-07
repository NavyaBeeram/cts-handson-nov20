package com.example.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("customer")

@RestController
public class Customercontroller {
	
	
@Autowired
private CustomerService customerservice;
@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE)
public Customer createcustomerAPI(@RequestBody Customer cus)
{
 
	
	
	
	
	
	
Customer createdCustomer=customerservice.addcustomer(cus);
	
	System.out.println("cdecdecde");
	
	
	
	
	return createdCustomer;

}





@GetMapping

public ArrayList<Customer> getAllCustomer()
{
	return customerservice.fetchCustomers();
	
}
@GetMapping("{customerId}")
public Customer getCustomer(@PathVariable("customerId") int id)
{
	Customer customer=customerservice.fetchCustomer(id);
	return customer;
}
	










}