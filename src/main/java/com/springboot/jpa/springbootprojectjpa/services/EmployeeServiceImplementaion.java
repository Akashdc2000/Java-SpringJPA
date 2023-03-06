package com.springboot.jpa.springbootprojectjpa.services;

import com.springboot.jpa.springbootprojectjpa.entity.Employee;
import com.springboot.jpa.springbootprojectjpa.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementaion implements EmployeeService{

    @Autowired
    private EmployeesRepository employeesRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return  employeesRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }
}
