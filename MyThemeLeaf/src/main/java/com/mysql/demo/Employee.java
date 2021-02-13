package com.mysql.demo;

import lombok.Data;

@Data
public class Employee { 
	public Employee()
	{}
 public Employee(String name, int roll, int salary) {
		this.name=name;
		this.roll=roll;
		this.salary=salary;
	}
private String name;//="rohit";
 private int roll;
 private double salary;
 
}
