package com.emreilgar.repository;

import com.emreilgar.repository.entity.Company;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface ICompanyRepository extends MongoRepository<Company,String> {
    List<Company> findAll();
}
