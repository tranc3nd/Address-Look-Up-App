package com.employees.curapatients.service;

import com.employees.curapatients.exception.ResourceNotFoundException;
import com.employees.curapatients.modal.Employee;
import com.employees.curapatients.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

   
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id :" + id));
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Employee getEmployeeByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id :" + id));
        
        if (employee != null) {
            employee.setName(employeeDetails.getName());
            employee.setPhoneNumber(employeeDetails.getPhoneNumber());
            employee.setSuperVisors(employeeDetails.getSuperVisors());
            employee.setUserName(employeeDetails.getUserName());
            employee.setPassWord(employeeDetails.getPassWord());
            employeeRepository.save(employee);
        }
        return employee;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
