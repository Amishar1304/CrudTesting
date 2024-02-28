package com.breginner.MokitoTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.breginner.MokitoTesting.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
