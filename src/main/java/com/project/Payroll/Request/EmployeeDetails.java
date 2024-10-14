package com.project.Payroll.Request;

import com.project.Payroll.entities.City;
import com.project.Payroll.entities.Department;
import com.project.Payroll.entities.Gender;
import com.project.Payroll.entities.Job;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String phone;
    private Gender gender;
    private City city;
    private Job job;
    private Department department;
    private Date employmentStart;
}
