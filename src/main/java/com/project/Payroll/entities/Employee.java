package com.project.Payroll.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName",nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "DOB", nullable = false)
    private Date dob;

    @Column(name = "email" , nullable = false)
    private String email;

    @Column(name = "phone" , nullable = false)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    private Job job;

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Column(name = "employment_start", nullable = false)
    private Date employmentStart;
}
