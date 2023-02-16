package com.emreilgar.manager;

import com.emreilgar.dto.request.UserGetAllRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;

@FeignClient(name = "company-manager"
        ,url = "${myapplication.company.feignurl}"
        ,decode404 = true)
public interface ICompanyManagerClient {
    @PostMapping("/userEntity")
    ResponseEntity<Boolean>userEntity(@RequestBody @Valid UserGetAllRequestDto dto);
}
