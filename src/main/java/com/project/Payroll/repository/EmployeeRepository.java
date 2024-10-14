package com.project.Payroll.repository;

import com.project.Payroll.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(
            value = "select * from employee",
            nativeQuery = true
    )
    public List<Employee> fetchAllEmployee();
}
