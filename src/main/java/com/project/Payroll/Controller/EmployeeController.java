package com.project.Payroll.Controller;

import com.project.Payroll.Request.EmployeeDetails;
import com.project.Payroll.entities.Employee;
import com.project.Payroll.response.GenericResponse;
import com.project.Payroll.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/")
@CrossOrigin(origins = {"http://localhost:3000"})
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping("/")
    public List<Employee> fetchAllEmployee(){
        return EmployeeService.fetchAllEmployee();
    }

    @PostMapping("/")
    public GenericResponse addEmployee(@RequestBody EmployeeDetails employeeDetails){
        EmployeeService.addEmployee(employeeDetails);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully added Employee").body(null).build();
    }
}
