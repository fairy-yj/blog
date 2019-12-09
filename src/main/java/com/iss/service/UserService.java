package com.iss.service;

import com.iss.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
