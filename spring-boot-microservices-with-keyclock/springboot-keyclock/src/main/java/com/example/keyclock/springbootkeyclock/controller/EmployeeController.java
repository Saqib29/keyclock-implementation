package com.example.keyclock.springbootkeyclock.controller;

import com.example.keyclock.springbootkeyclock.model.Employee;
import com.example.keyclock.springbootkeyclock.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
