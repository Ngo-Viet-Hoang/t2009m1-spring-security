package com.t2009m1.t2009m1springsecurity.entity.dto;

import lombok.*;

// Khi phát triển to hơn thì thông tin ở đây sẽ ít hơn nhiều so với Credential
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CredentialDto {
    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private String scope;
}
