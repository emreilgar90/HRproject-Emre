package com.emreilgar.controller;

import com.emreilgar.dto.request.CreateCompanyRequestDto;
import com.emreilgar.dto.response.CompanyGetAllResponseDto;
import com.emreilgar.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.emreilgar.constansts.RestApis.COMPANYFINDALL;
import static com.emreilgar.constansts.RestApis.CREATECOMPANY;

@RestController
@RequestMapping("COMPANY")
@RequiredArgsConstructor


public class CompanyController {

    private final CompanyService companyService;

    @GetMapping(COMPANYFINDALL) //tüm şirketleri listele
    public ResponseEntity<List<CompanyGetAllResponseDto>> findAllCompany(){
        return ResponseEntity.ok(companyService.findAll1());
    }

    @PostMapping(CREATECOMPANY)
    @CrossOrigin("*")
    public ResponseEntity<Boolean> createCompany(@RequestBody @Valid CreateCompanyRequestDto dto){
        return ResponseEntity.ok(companyService.createCompany(dto));
    }




}
