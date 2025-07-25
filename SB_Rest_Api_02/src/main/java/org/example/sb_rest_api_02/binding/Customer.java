package org.example.sb_rest_api_02.binding;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String name;
    private String email;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
