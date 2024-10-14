package com.project.Payroll.services.Impl;

import com.project.Payroll.Request.EmployeeDetails;
import com.project.Payroll.entities.Employee;
import com.project.Payroll.repository.EmployeeRepository;
import com.project.Payroll.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployee(){
        return employeeRepository.fetchAllEmployee();
    }

    public void addEmployee(EmployeeDetails employeeDetails){
        Employee employee = new Employee();
        employee.setFirstName(employee.getFirstName());
        employee.setLastName(employee.getLastName());
        employee.setDob(employee.getDob());
        employee.setCity(employee.getCity());
        employee.setEmail(employee.getEmail());
        employee.setDepartment(employee.getDepartment());
        employee.setJob(employee.getJob());
        employee.setPhone(employee.getPhone());
        employee.setGender(employee.getGender());

        employeeRepository.save(employee);
    }
}
