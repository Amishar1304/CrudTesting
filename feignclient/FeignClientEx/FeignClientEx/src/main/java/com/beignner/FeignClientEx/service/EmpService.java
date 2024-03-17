package com.beignner.FeignClientEx.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.beignner.FeignClientEx.model.Employee;

@FeignClient(url="http://localhost:8084", value ="employee-service")

public interface EmpService {
	
	@GetMapping("/employee")
    public List<Employee> getAllEmployees();

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id);
    
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee); 
    
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee emp);
   
    
    @DeleteMapping("/employee")
    public void deleteEmployee(@PathVariable int id); 
	

}
