package com.emreilgar.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;



@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document
public class Company{  //mongodb den yapıyorum
    @Id
    String id;

    String companyname;
    String companytitle;
    String mersisno;
    String taxno; //tax= vergi
    String taxAdministration;   //vergi dairesi
    String logo;
    String telephone;
    String adress;
    String email;
    int numberOfEmployees; //çalışan sayısı
    LocalDate foundationYear; // kuruluş yılı
    LocalDate contractstartdate; //sözleşme başlangıç
    LocalDate contractenddate; // sözleşme bitiş tarihi
    Status status;



}
