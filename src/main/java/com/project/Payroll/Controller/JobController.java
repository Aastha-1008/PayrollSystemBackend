package com.project.Payroll.Controller;

import com.project.Payroll.entities.Job;
import com.project.Payroll.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job/")
@CrossOrigin(origins = {"http://localhost:3000"})
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/{departmentId}")
    public List<Job> fetchAllJob(@PathVariable Long departmentId ){
        System.out.println(departmentId);
        return jobService.fetchAllJobForDepartmentId(departmentId);
    }

    @PostMapping("/{id}/{name}")
    public void addJobToDepartment(@PathVariable Long departmentId , @PathVariable String name){
        jobService.addJobToDepartment(departmentId , name);
    }

}
