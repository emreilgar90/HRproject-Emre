package com.emreilgar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import nonapi.io.github.classgraph.json.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class PersonelProfile {
    @Id
    String id;   //Nosql veritanlarında mongo db gibi id long olamaz! String olacak
    /**
     * Auth Microservice de kayıt olan bir kullanıcının id bilgisini tutar.
     * Yani birisi Register veyahut Login olmak isterse UserProfileDb'ine bilgi vermek amaçlı.*/

    Long authid;
    String username;
    String email;
    String phone;
    String address;
    String profileImage;
}
