package com.project.Payroll.services;

import com.project.Payroll.Request.DepartmentDetails;
import com.project.Payroll.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepartment();

    Department getDepartmentById(Long id);

    void addDepartment(DepartmentDetails departmentDetails);
}
