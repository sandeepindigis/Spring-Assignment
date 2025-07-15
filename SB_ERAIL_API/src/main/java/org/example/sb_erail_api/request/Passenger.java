package org.example.sb_erail_api.request;

import lombok.Data;

@Data
public class Passenger {
    private String fname;
    private String lname;
    private Integer age;
    private String gender;
    private String from;
    private String to;
    private String doj;
    private String phone;
    private String trainNumber;
}
