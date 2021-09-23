package com.example.spring_boot_jwt_phamngocnhuy.service;

import com.example.spring_boot_jwt_phamngocnhuy.authen.UserPrincipal;
import com.example.spring_boot_jwt_phamngocnhuy.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
