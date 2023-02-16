package com.emreilgar.repository.entity;

import com.emreilgar.repository.AuthType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document
public class Auth {
    @Id
    private Long id;
    @Indexed(unique = true)
    private String username;  /***uniq olsun diye hibernate'in db  de uniq olup olmamasını sorguladığı @Column(unique=true)
                              anatasyonu var fakat postgrede geçerli heralde ? mongodb kullandığım için hangi anatasyonu kullanmam gerek
                              bilmiyorum  ----> buldum ! @Indexed(unique = true)   */
    private String password;
    @Indexed(unique = true)
    private String email;
    @Builder.Default   //default olarak user olarak ayarladım.
    private AuthType authType=AuthType.USER;

}
