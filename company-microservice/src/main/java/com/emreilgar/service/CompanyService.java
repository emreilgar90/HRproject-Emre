package com.emreilgar.service;


import com.emreilgar.dto.request.CreateCompanyRequestDto;
import com.emreilgar.dto.response.CompanyGetAllResponseDto;
import com.emreilgar.mapper.ICompanyMapper;
import com.emreilgar.repository.ICompanyRepository;
import com.emreilgar.repository.entity.Company;
import com.emreilgar.utility.ServiceManager;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyService extends ServiceManager<Company,String> {
    private final ICompanyRepository repository;

    public CompanyService(ICompanyRepository repository) {
        super(repository);
        this.repository = repository;
    }



    //tüm şirketleri listeleyen metot
    public List<CompanyGetAllResponseDto> findAll1() {
        List<Company>companies=repository.findAll();

        return ICompanyMapper.INSTANCE.fromCompany(companies);
    }


    public Boolean createCompany(CreateCompanyRequestDto dto) {
        Company company= ICompanyMapper.INSTANCE.fromCreateCompanyRequestDto(dto);
        try {
            save(company);
        }
        catch (Exception e){
            throw new RuntimeException("COMPANY OLUŞTURULAMADI");
        }
        return true;
    }
}
