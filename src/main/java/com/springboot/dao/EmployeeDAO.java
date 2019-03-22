package com.springboot.dao;

import com.springboot.model.Employee;
import com.springboot.model.Employees;

public class EmployeeDAO {
	
	    private static Employees list = new Employees();
	     
	    static
	    {
	        list.getEmployeeList().add(new Employee(1, "priya", "dharshini", "priya@gmail.com"));
	        list.getEmployeeList().add(new Employee(2, "aaa", "xxx", "abc@gmail.com"));
	        list.getEmployeeList().add(new Employee(3, "bbb", "yyy", "bbb@gmail.com"));
	    }
	     
	    public Employees getAllEmployees()
	    {
	        return list;
	    }
	     
	    public void addEmployee(Employee employee) {
	        list.getEmployeeList().add(employee);
	    }
	}

