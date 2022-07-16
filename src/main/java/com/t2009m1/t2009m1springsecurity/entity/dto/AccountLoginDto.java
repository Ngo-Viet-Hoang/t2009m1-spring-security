package com.t2009m1.t2009m1springsecurity.entity.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountLoginDto {
    private String username;
    private String password;
}
