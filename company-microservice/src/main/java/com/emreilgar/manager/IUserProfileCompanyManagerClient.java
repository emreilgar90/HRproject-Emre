package com.emreilgar.manager;

import com.emreilgar.dto.request.CreateCompanyRequestDto;
import com.emreilgar.dto.response.CompanyGetAllResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;
import java.util.List;

import static com.emreilgar.constansts.RestApis.COMPANYFINDALL;
import static com.emreilgar.constansts.RestApis.CREATECOMPANY;

@FeignClient(name = "user-profile-company-manager"
        ,url = "${myapplication.user.feignurl}"
        ,decode404 = true)
public interface IUserProfileCompanyManagerClient {
        //controller'a yazdıklarımızı buraya da yapıştırıyoruz !
        // company service'e gidip IUserProfileManagerClient'ı enjekte ettim.

        @PostMapping("/companyEntity")
        ResponseEntity<Boolean> companyEntity(@RequestBody @Valid CompanyGetAllResponseDto dto);

        @GetMapping(COMPANYFINDALL) //tüm şirketleri listele
        ResponseEntity<List<CompanyGetAllResponseDto>> findAllCompany();

        @PostMapping(CREATECOMPANY)
        @CrossOrigin("*")
        ResponseEntity<Boolean> createCompany(@RequestBody @Valid CreateCompanyRequestDto dto);







}
