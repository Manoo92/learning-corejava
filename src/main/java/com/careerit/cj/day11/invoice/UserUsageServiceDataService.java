package com.careerit.cj.day11.invoice;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserUsageServiceDataService {


    public void generateAndSendInvoices(){
        UserUsageServiceData userUsageServiceData = loadUsageUserData();
        // Logic Generate invoice and create invoice pdf send invoice as email
    }


    private UserUsageServiceData loadUsageUserData(){
        ObjectMapper objectMapper = new ObjectMapper();
        UserUsageServiceData userUsageServiceData = null;
        try{
            userUsageServiceData = objectMapper
                    .readValue(UserUsageServiceDataService.class.getResourceAsStream("/user_usage_service_data.json"),UserUsageServiceData.class);
        }catch (Exception e){
            System.out.println(e);
        }
        return userUsageServiceData;
    }

}
