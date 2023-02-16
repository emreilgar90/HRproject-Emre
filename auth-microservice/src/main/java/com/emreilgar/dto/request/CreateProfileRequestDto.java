package com.emreilgar.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder    //lombok anatasyonlarını ekledik
public class CreateProfileRequestDto {
    @NotNull
    private Long authid;
    @NotBlank
    private String username;
    @NotBlank
    @Email
    private String email;
    private String token;
}
