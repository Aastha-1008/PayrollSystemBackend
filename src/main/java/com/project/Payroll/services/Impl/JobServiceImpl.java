package com.project.Payroll.services.Impl;

import com.project.Payroll.entities.Department;
import com.project.Payroll.entities.Job;
import com.project.Payroll.repository.DepartmentRepository;
import com.project.Payroll.repository.JobRepository;
import com.project.Payroll.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Job> fetchAllJobForDepartmentId(Long departmentId){
        return jobRepository.fetchAllJobForDepartmentId(departmentId);
    }

    public void addJobToDepartment(Long departmentId , String name ){
        Department d = departmentRepository.getDepartmentById(departmentId);
        Job job = jobRepository.isjobExistForDepartment( departmentId , name);
        if(job == null) {
            Job j = new Job();
            j.setTitle(name);
            j.setDepartment(d);

            jobRepository.save(j);
        }
    }
}
