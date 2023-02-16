package com.emreilgar.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponseDto {

    private Long authid;
    private String content; //içerik demek 
    private String email;
    private String password;
    private String repassword;
    private String username;
    private Integer registerstate;

    //buraya mail service ile aktivasyon kodu göndermem lazım.



}
