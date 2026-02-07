package com.careerit.cj.day11;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeManager {

    public static void main(String[] args) {

        ObjectMapper objectMapper = AppConfig.getObjectMapper();
        try {
            Employee emp = objectMapper.readValue(EmployeeManager.class.getResourceAsStream("/emp.json"),
                    Employee.class);
            System.out.println(emp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
