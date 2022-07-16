package com.t2009m1.t2009m1springsecurity.restapi;

import com.t2009m1.t2009m1springsecurity.entity.dto.AccountLoginDto;
import com.t2009m1.t2009m1springsecurity.entity.dto.AccoutRegisterDto;
import com.t2009m1.t2009m1springsecurity.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    final AccountService accountService;
    @RequestMapping(path = "register", method = RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody AccoutRegisterDto accoutRegisterDto){
        return ResponseEntity.ok(accountService.register(accoutRegisterDto));
    }
//    @RequestMapping(path = "login", method = RequestMethod.POST)
//    public ResponseEntity<?> login(@RequestBody AccountLoginDto accountLoginDto){
//        return ResponseEntity.ok(accountService.login(accountLoginDto));
//    }
    @RequestMapping(method = RequestMethod.GET)
    public String getInformation(){
        return "";
    }
}
