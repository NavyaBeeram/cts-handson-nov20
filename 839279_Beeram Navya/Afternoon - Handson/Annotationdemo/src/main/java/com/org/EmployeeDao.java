package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	DBConfig dbconfig;

	public void store() {
		System.out.println("store() method in DAO layer");
	}

	public void getDburl() {
		System.out.println("dburl");
	}

}