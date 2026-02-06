package com.careerit.cj.day10;

import java.util.List;

public class EmployeeDriver {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        List<EmployeeDto> employeeDtos = employeeService.getEmployeeDetailsWithManagerName();
        employeeService.showDetails(employeeDtos);
        System.out.println(employeeService.getEmployeesAsMgr("Rajesh"));

    }
}
