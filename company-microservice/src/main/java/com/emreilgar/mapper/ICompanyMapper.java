package com.emreilgar.mapper;

import com.emreilgar.dto.request.CreateCompanyRequestDto;
import com.emreilgar.dto.response.CompanyGetAllResponseDto;
import com.emreilgar.repository.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
    public interface ICompanyMapper {
        ICompanyMapper INSTANCE = Mappers.getMapper(ICompanyMapper.class);

        //dto'yu company'e çevirdik.
        Company fromCreateCompanyRequestDto(final CreateCompanyRequestDto dto);

        // Company fromCompanyGetAllResponseDto(final CompanyGetAllResponseDto dto);

        List<CompanyGetAllResponseDto>  fromCompany(final List<Company> company);
}
