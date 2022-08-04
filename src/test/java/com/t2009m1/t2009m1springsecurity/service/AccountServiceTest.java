package com.t2009m1.t2009m1springsecurity.service;

import com.t2009m1.t2009m1springsecurity.T2009m1SpringSecurityApplication;
import com.t2009m1.t2009m1springsecurity.entity.Credential;
import com.t2009m1.t2009m1springsecurity.entity.dto.AccountLoginDto;
import com.t2009m1.t2009m1springsecurity.entity.dto.AccoutRegisterDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = T2009m1SpringSecurityApplication.class)
class AccountServiceTest {

    @Autowired
    AccountService accoutService;

    @Test
    void register() {
        AccoutRegisterDto accoutRegisterDto = new AccoutRegisterDto();
        accoutRegisterDto.setUsername("viethoang04");
        accoutRegisterDto.setPassword("1234453");
        accoutRegisterDto.setRole(1);
        AccoutRegisterDto afterCreate = accoutService.register(accoutRegisterDto);
        System.out.println(afterCreate);
    }
    @Test
    void login() {
        AccountLoginDto accountLoginDto = new AccountLoginDto();
        accountLoginDto.setUsername("viethoang04");
        accountLoginDto.setPassword("123445");
        Credential credential = accoutService.login(accountLoginDto);
        System.out.println(credential.toString());
    }
}