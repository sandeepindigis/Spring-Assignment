package org.example.data_jpa_comp_key_03.entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class AccountsPK {
    private Integer account_id;
    private Integer account_number;
    private String account_type;

    public AccountsPK(){}

    public AccountsPK(Integer account_id, Integer account_number, String account_type) {
        this.account_id = account_id;
        this.account_number = account_number;
        this.account_type = account_type;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Integer account_number) {
        this.account_number = account_number;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    @Override
    public String toString() {
        return "AccountsPK{" +
                "account_id=" + account_id +
                ", account_number=" + account_number +
                ", account_type='" + account_type + '\'' +
                '}';
    }
}
