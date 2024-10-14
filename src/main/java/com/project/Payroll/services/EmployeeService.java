package com.project.Payroll.services;

import com.project.Payroll.Request.EmployeeDetails;
import com.project.Payroll.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> fetchAllEmployee();

    void addEmployee(EmployeeDetails employeeDetails);
}
