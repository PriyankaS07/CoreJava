package com.spring.FirstDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Employee {
	private int id;
	//@Autowired
	//@Qualifier("dept2")
	Department dept;
	public Employee(int id, Department dept) {
		super();
		this.id = id;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + "]";
	}
	
	
}
