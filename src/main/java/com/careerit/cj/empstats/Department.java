package com.careerit.cj.empstats;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private int deptno;
    private String dname;
    private String loc;
    private List<Employee> employees;
}
