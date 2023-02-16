package com.emreilgar.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequestDto { //dışarıdan alacağımız veriler.
    @NotBlank(message = "Kullanıcı adı boş geçilemez")
    @Size(min=3,max=32)
    /**
     * BüyükHarf olmamalı, küçük harf olmalı, rakam içerebilir, . nokta olabilir
     * diğer tüm özel karakterler olamaz.
     */
    private String username;
    @NotBlank(message = "Kullanıcı adı boş geçilemez")
    @Size(min=8,max=64)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*!])(?=\\S+$).{8,}$" )
    private String password;
    @NotBlank(message = "Kullanıcı adı boş geçilemez")
    @Size(min=8,max=64)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*!])(?=\\S+$).{8,}$" )
    private String repassword;
    @Email(message = "Lütfen geçerli bir e-mail adresi giriniz.")
    private String email;


}
