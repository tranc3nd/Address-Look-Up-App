package com.employees.curapatients.repository;

import com.employees.curapatients.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> { 
    Employee findByName(String name);
    Employee findByUsername(String userName);
}
