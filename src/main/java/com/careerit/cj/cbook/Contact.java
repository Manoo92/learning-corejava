package com.careerit.cj.cbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Contact {
    private String id;
    private String name;
    private String email;
    private LocalDate dob;
    private String mobile;
}
