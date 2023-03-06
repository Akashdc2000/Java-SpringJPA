package com.springboot.jpa.springbootprojectjpa.services;

import com.springboot.jpa.springbootprojectjpa.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
