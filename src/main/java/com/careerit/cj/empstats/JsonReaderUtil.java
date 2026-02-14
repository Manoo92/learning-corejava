package com.careerit.cj.empstats;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonReaderUtil {

    private JsonReaderUtil(){}

    public static DeptWrapper getDepartmentDetails() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream("/dept_with_emp.json"), DeptWrapper.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        throw new IllegalArgumentException("While reading data, file is missing or unknown data");

    }

}
