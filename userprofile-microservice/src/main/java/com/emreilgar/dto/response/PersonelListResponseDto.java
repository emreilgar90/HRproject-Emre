package com.emreilgar.dto.response;

public class PersonelListResponseDto { //şirket yöneticisi listelemesi için
    String firstName;
    String lastName;
    String phoneCompany;
    String email;

    //* şirket bilgisi istiyor buraya feignclient ile companyden bilgi çek
}
