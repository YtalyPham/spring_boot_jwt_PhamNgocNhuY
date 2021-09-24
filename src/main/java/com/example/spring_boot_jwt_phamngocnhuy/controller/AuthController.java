package com.example.spring_boot_jwt_phamngocnhuy.controller;


import com.example.spring_boot_jwt_phamngocnhuy.authen.UserPrincipal;
import com.example.spring_boot_jwt_phamngocnhuy.entity.Token;
import com.example.spring_boot_jwt_phamngocnhuy.entity.User;
import com.example.spring_boot_jwt_phamngocnhuy.service.TokenService;
import com.example.spring_boot_jwt_phamngocnhuy.service.UserService;
import com.example.spring_boot_jwt_phamngocnhuy.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        return userService.createUser(user);
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody User user) {
//
//        UserPrincipal userPrincipal =
//                userService.findByUsername(user.getUsername());
//
//        if (null == user || !new BCryptPasswordEncoder()
//                .matches(user.getPassword(), userPrincipal.getPassword())) {
//
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body("Account or password is not valid!");
//        }
//
//        Token token = new Token();
//        token.setToken(jwtUtil.generateToken(userPrincipal));
//
//        token.setTokenExpDate(jwtUtil.generateExpirationDate());
//        token.setCreatedBy(userPrincipal.getUserId());
//        tokenService.createToken(token);
//
//        return ResponseEntity.ok(token.getToken());
//    }
}



