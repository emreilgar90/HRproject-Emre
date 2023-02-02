package com.emreilgar.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class CompanyGetAllResponseDto {
    String companyname;
    String companytitle;
    String telephone;
    String adress;
    String email;

}
