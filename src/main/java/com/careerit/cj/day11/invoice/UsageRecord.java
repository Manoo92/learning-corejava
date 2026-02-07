package com.careerit.cj.day11.invoice;

import lombok.Data;

@Data
public class UsageRecord {
    private String userId;
    private String serviceId;
    private int units;
}