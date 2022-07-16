package com.t2009m1.t2009m1springsecurity.entity.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccoutRegisterDto {
    private long id;
    private String username;
    private String password;
    private String confirmPassword;
    private int role;

}
