package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	public void stroreEmployee() {
		System.out.println("Store( ) method in EmployeeService");
		employeedao.store();

	}

}