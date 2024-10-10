package com.project.Payroll.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Foreign key referencing the Employee table
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    // Salary with precision 12 and scale 2
    @Column(name = "salary", precision = 12, scale = 2, nullable = false)
    private BigDecimal salary;

    @Column(name = "prev_salary", precision = 12, scale = 2)
    private BigDecimal prevSalary;

    @Column(name = "hike_percent", precision = 5, scale = 2)
    private BigDecimal hikePercent;
}

