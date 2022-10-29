package com.example.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
