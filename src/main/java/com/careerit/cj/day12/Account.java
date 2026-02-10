package com.careerit.cj.day12;

import lombok.*;

@Data
@AllArgsConstructor
public class Account {
    protected String accNum;
    protected String name;
    protected String mobile;
    protected double balance;
}
