package com.example.spring;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String name;
	private LocalDate dob;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Customer(int cid, String name, LocalDate dob) {
		super();
		this.cid = cid;
		this.name = name;
		this.dob = dob;
	}
	
	

}
