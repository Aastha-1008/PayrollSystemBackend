package com.project.Payroll.repository;

import com.project.Payroll.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department , Long> {

    @Query(
            value = "select * from department",
            nativeQuery = true
    )
    public List<Department> getAllDepartment();

    @Query(
            value = "select * from department where id = :id",
            nativeQuery = true
    )
    public Department getDepartmentById(Long id);
}
