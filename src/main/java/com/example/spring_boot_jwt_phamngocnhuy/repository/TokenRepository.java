package com.example.spring_boot_jwt_phamngocnhuy.repository;

import com.example.spring_boot_jwt_phamngocnhuy.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
