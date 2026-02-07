package com.careerit.cj.day11.invoice;

import lombok.Data;
import java.util.List;

@Data
public class UserUsageServiceData {
    private List<User> users;
    private List<Service> services;
    private List<UsageRecord> usageRecords;
}