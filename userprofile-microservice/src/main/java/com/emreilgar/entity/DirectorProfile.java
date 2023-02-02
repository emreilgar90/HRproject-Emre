package com.emreilgar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document
public class DirectorProfile extends PersonelProfile{

    LocalDate dateOfBirth; //doğum tarihi
    String placeOfBirth; //doğum yeri
    String tcNumber;

    LocalDate startDateOfWork;

    String job; //meslek

    String department;


    Long companyid;


}
