package com.careerit.cj.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    public List<EmployeeDto> getEmployeeDetailsWithManagerName() {
           List<Employee> employees = loadEmployeeDetails();
           return  getEmpWithManagerNameList(employees);

    }

    public List<String> getEmployeesAsMgr(String name){
        List<EmployeeDto> employeeDtos = getEmployeeDetailsWithManagerName();
        List<String> employeeNames = new ArrayList<>();
        for(EmployeeDto empDto: employeeDtos){
            if(empDto.getMgrName().equalsIgnoreCase(name)){
                employeeNames.add(empDto.getEname());
            }
        }
        return employeeNames;

    }

    public void showDetails(List<EmployeeDto> employeeDtos) {
            for(EmployeeDto empDto: employeeDtos){
                System.out.println(empDto);
            }
    }

    private List<EmployeeDto> getEmpWithManagerNameList(List<Employee> employees) {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for(Employee emp: employees){
            String mgrName = getManagerName(employees,emp.getMgr());
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setEmpno(emp.getEmpno());
            employeeDto.setEname(emp.getEname());
            employeeDto.setMgrName(mgrName);
            employeeDto.setSalary(emp.getSalary());
            employeeDtos.add(employeeDto);
        }
        return employeeDtos;
    }
    private List<Employee> loadEmployeeDetails() {
        List<Employee> employees = new ArrayList<>();
        try(
            BufferedReader br = new BufferedReader(
                    new FileReader(EmployeeService.class.getResource("/emp.txt").getFile()))) {

            String line = null;
            int index = 1;
            while((line=br.readLine()) != null){
                if(index == 1){
                    index++;
                    continue;
                }
                String[] dataArr = line.split(",");
                Employee employee = new Employee();
                employee.setEmpno(dataArr[0]);
                employee.setEname(dataArr[1]);
                employee.setMgr(dataArr[2]);
                employee.setSalary(Double.parseDouble(dataArr[3]));
                employees.add(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }


    private String getManagerName(List<Employee> employees, String mgrId) {
        String name = "";
        for (Employee employee : employees) {
            if (employee.getEmpno().equalsIgnoreCase(mgrId)) {
                name = employee.getEname();
                break;
            }
        }
        return name;
    }
}
