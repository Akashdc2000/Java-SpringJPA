package com.springboot.jpa.springbootprojectjpa.repository;

import com.springboot.jpa.springbootprojectjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee,Long> {
}
