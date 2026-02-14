package com.careerit.cj.empstats;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    private DeptWrapper deptWrapper;
    private List<Employee> employees;
    private List<Department> departments;

    private Map<Integer,Employee> empMap;
    private Map<Integer,DeptDto> deptMap;
    private Map<String,List<Employee>> deptEmpMap;

    public EmployeeService(){
        deptWrapper = JsonReaderUtil.getDepartmentDetails();
        employees = deptWrapper
                .getDepartments()
                .stream()
                .flatMap(d->d.getEmployees().stream())
                .toList();
        departments = deptWrapper.getDepartments();
        // TODO populate all map field values
    }

    // Get unique job title
    public Collection<String> getUniqueJobTitles(){
        return
                employees.stream()
                        .map(Employee::getJob)
                        .collect(Collectors.toSet());
    }

    // Get empno, name, mgr_name, sal, dname, loc of all the employee

    // Get all employee names of give dname

    // Get deptno, dname, loc, max salary of all departments.

    // Get max paid employee(s) details

    // Get emp count, max sal, min sal, avg sal, total sal of all employee
}
