package com.example.keyclock.springbootkeyclock.repository;

import com.example.keyclock.springbootkeyclock.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
