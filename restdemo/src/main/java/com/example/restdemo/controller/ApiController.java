package com.example.restdemo.controller;

import java.util.List;
import java.util.Optional;

import com.example.restdemo.model.Employee;
import com.example.restdemo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private EmployeeRepository employeeRepository;

   @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
    @GetMapping("/getEmployee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id)
    {
        return employeeRepository.findById(id);
    }
}
