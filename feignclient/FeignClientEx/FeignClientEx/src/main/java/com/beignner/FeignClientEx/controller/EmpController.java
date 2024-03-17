package com.beignner.FeignClientEx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beignner.FeignClientEx.model.Employee;
import com.beignner.FeignClientEx.service.EmpService;

@RestController

public class EmpController {
	@Autowired
	private EmpService service;
	
	@GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
    
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }
    
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee emp)
    {
    return service.updateEmployee(emp);
    }
    
    @DeleteMapping("/employee")
    public void deleteEmployee(@PathVariable int id) {
      service.deleteEmployee(id);
  }

	

}
