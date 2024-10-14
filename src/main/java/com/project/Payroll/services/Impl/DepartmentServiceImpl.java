package com.project.Payroll.services.Impl;

import com.project.Payroll.Request.DepartmentDetails;
import com.project.Payroll.entities.Department;
import com.project.Payroll.entities.Job;
import com.project.Payroll.repository.DepartmentRepository;
import com.project.Payroll.repository.JobRepository;
import com.project.Payroll.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private JobRepository jobRepository;

    public List<Department> getAllDepartment(){
        return departmentRepository.getAllDepartment();
    }

    public Department getDepartmentById(Long id){
        return departmentRepository.getDepartmentById(id);
    }

    public void addDepartment(DepartmentDetails departmentDetails){
        Department d = new Department();
        d.setName(departmentDetails.getName());

        List<Job> jobs = new ArrayList<>();

        List<String> jobList = departmentDetails.getJobs();
        for(String s : jobList){
            Job j = new Job();
            j.setTitle(s);
            j.setDepartment(d);
        }
        d.setJob(jobs);
        departmentRepository.save(d);
        jobRepository.saveAll(jobs);
    }
}
