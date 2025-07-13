package org.example.springboot02app.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public UserDao(){
        System.out.println("UserDao constructor");
    }
}
