package com.project.Payroll.services;

import com.project.Payroll.entities.Job;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface JobService {

    List<Job> fetchAllJobForDepartmentId(Long departmentId);

    void addJobToDepartment(Long departmentId , String name );

}
