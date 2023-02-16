package com.emreilgar.repository.entity;

import com.emreilgar.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document
public class UserProfile extends BaseEntity {
    @Id
    String id;
    Long authid;
    String photo;

    String firstName;
    String middleName;
    String lastName;
    String middleLastName;
    LocalDate dateofbirth;
    String placeOfBirth;
    String tcNum;

    LocalDate startDatOfWork; //ise giriş

    LocalDate dismissalDate;  //is cıkış

    //active'lik durumunu base entityden alıyorum.
    Job job;
    Department department;
    @Email
    String email;

    String address;

    String phoneCompany;


    //feign client ile company service'e bağlayıp buraya eklemen lazım





}
