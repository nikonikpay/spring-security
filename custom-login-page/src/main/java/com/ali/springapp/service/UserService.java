package com.ali.springapp.service;


import com.ali.springapp.entity.User;
import com.ali.springapp.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
