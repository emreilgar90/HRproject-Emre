package com.emreilgar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class AdminProfile extends PersonelProfile{
    LocalDate dateOfBirth; //doğum tarihi
    String placeOfBirth; //doğum yeri
    String tcNumber;

    LocalDate startDateOfWork;

    String job; //meslek

    String department;



}
