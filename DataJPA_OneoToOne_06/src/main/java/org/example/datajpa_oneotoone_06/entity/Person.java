package org.example.datajpa_oneotoone_06.entity;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;
    private String person_name;
    private String person_gender;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Passport person_passport;

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_gender() {
        return person_gender;
    }

    public void setPerson_gender(String person_gender) {
        this.person_gender = person_gender;
    }

    public Passport getPerson_passport() {
        return person_passport;
    }

    public void setPerson_passport(Passport person_passport) {
        this.person_passport = person_passport;
    }
}
