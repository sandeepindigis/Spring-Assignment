package org.example.datajpa_oneotoone_06.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pass_id;
    private String pass_number;
    private LocalDate issue_date;
    private LocalDate expiry_date;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;

    public Integer getPass_id() {
        return pass_id;
    }

    public void setPass_id(Integer pass_id) {
        this.pass_id = pass_id;
    }

    public String getPass_number() {
        return pass_number;
    }

    public void setPass_number(String pass_number) {
        this.pass_number = pass_number;
    }

    public LocalDate getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(LocalDate issue_date) {
        this.issue_date = issue_date;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
