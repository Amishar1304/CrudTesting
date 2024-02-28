package com.breginner.MokitoTesting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breginner.MokitoTesting.model.Employee;
import com.breginner.MokitoTesting.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepo;
	
	public List<Employee> getAllEmployees() {
        return employeerepo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeerepo.findById(id).orElse(null);
    }
    
    public Employee createEmployee(Employee employee) {
    	return employeerepo.save(employee);
	}
//    public Employee createEmployee(Employee employee) {
//        // Check if employee already exists
//        Optional<Employee> existingEmployee = employeerepo.findById(employee.getId());
//        if (existingEmployee.isPresent()) {
//            throw new ResourceNotFoundException("Employee with ID " + employee.getId() + " already exists.");
//        }
//
//        // If employee doesn't exist, save it
//        return employeerepo.save(employee);
//    }
//    
    


    public Employee updateEmployee(int id, Employee employee) {
        Employee existingEmployee = employeerepo.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            return employeerepo.save(existingEmployee);
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        Employee existingEmployee = employeerepo.findById(id).orElse(null);
        if (existingEmployee != null) {
        	employeerepo.delete(existingEmployee);
            return true;
        }
        return false;
    }

	public Employee saveEmployee(Employee employee) {
		return employeerepo.save(employee);
	}

	
}


