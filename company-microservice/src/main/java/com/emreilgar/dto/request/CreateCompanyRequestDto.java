package com.emreilgar.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateCompanyRequestDto {
    @NotBlank
    String companyname;
    @NotBlank
    String companytitle;
    @NotBlank
    String mersisno;
    @NotBlank
    @Email
    String email;

}
