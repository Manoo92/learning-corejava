package com.careerit.cj.day11.invoice;

import lombok.Data;

@Data
public class Service {
    private String serviceId;
    private String name;
    private double unitPrice;
    private String unit;
}
