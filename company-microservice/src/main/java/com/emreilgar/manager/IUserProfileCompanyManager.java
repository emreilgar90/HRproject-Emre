package com.emreilgar.manager;

import com.emreilgar.dto.response.CompanyGetAllResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;

@FeignClient(name = "user-profile-company-manager"
        ,url = "${myapplication.user.feignurl}"
        ,decode404 = true)
public interface IUserProfileCompanyManager {

        @PostMapping("/companyEntity")
        ResponseEntity<Boolean> companyEntity(@RequestBody @Valid CompanyGetAllResponseDto dto);




}
