package com.example.spring_boot_jwt_phamngocnhuy.service;

import com.example.spring_boot_jwt_phamngocnhuy.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
