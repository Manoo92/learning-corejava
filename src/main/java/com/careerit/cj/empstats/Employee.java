package com.careerit.cj.empstats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDate hiredate;
    private double sal;
    private Double comm;
}