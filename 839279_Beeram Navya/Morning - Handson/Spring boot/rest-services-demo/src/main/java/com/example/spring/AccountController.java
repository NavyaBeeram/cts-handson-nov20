package com.example.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@Controller
public class AccountController
{
	
	@RequestMapping("/")
	public String met()
	{
		System.out.println("saregamapae");
		return "manju";
	}
	
	*/
@RestController
@RequestMapping(value="cde")
public class AccountController{
	@RequestMapping(value="get",produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance()
	{
		Account acc=new Account();

	acc.setNum(3369);
	acc.setAmount(333);
	return acc;
	}
	@RequestMapping("/num/{ccnum}")
	public Account getBalance(@PathVariable("ccnum") int accnum)
	{
		Account acc=new Account();
		acc.setAmount(accnum);
		acc.setNum(new Double(Math.random()*accnum).longValue());
		return acc;
	}





}