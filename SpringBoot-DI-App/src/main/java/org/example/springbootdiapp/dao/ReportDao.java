package org.example.springbootdiapp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

    public String getByName(Integer userId) {
        if(userId==100){
            return "John";
        }else if(userId==101){
            return "Smith";
        }else {
            return "Name not f";
        }
    }
}
