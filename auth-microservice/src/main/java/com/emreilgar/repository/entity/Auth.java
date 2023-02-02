package com.emreilgar.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document
public class Auth {   //postgresql
    @Id
    Long id;
    String username;
    String password;
    String email;

}
