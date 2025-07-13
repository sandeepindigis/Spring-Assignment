package org.example.data_jpa_comp_key_03.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Accounts {
    private String holderName;
    private String branchName;

    @EmbeddedId
    private AccountsPK accountsPK;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public AccountsPK getAccountsPK() {
        return accountsPK;
    }

    public void setAccountsPK(AccountsPK accountsPK) {
        this.accountsPK = accountsPK;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "holderName='" + holderName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", accountsPK=" + accountsPK +
                '}';
    }
}
