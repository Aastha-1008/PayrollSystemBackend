package com.project.Payroll.repository;

import com.project.Payroll.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job,Long> {

    @Query(
            value = "select * from job where department_id = :departmentId",
            nativeQuery = true
    )
    public List<Job> fetchAllJobForDepartmentId(Long departmentId);


    @Query(
            value = "select * from job where department_id = :departmentId and title = :name",
            nativeQuery = true
    )
    public Job isjobExistForDepartment(Long departmentId , String name);
}
