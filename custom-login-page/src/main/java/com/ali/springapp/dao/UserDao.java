package com.ali.springapp.dao;


import com.ali.springapp.entity.User;
public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);


}
