package com.t2009m1.t2009m1springsecurity.util;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.t2009m1.t2009m1springsecurity.entity.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {
    @Test
    public void testGenerateToken(){
//        String accessToken = JwtUtil.generateToken("123123", "User", "T2009M1", 7 *24 * 60 * 60 *1000);
//        System.out.println();


        // co ham verify de verify token
        // neu thay token vi du vao ham String accsess Token = "Token" va thay doi  JWT_SECRET_KEY(signature) = "secret- cahnge" thi ham verify loi
        // => van nhin thay token nhuwn ko con dang tin vi signature

//        DecodedJWT decodedJWT = JwtUtil.getVerifier().verify(accessToken);
//        System.out.println(decodedJWT.getSubject());
//        System.out.println(decodedJWT.getIssuer());
//        System.out.println(decodedJWT.getExpiresAt());

    Account account = Account.builder()
            .id(System.currentTimeMillis())
            .role(1)
            .username("viethoang")
            .passwordHash("xyz")
            .build();
    String accessToken = JwtUtil.generateTokenByAccount(account, 15 * 24 * 60 * 60 * 1000 );
    System.out.println(accessToken);

}

}