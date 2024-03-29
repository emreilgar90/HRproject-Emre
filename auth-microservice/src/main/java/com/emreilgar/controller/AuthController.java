package com.emreilgar.controller;

import com.emreilgar.dto.request.DoLoginRequestDto;
import com.emreilgar.dto.request.RegisterRequestDto;

import com.emreilgar.dto.response.RegisterResponseDto;
import com.emreilgar.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//restapi'yi komple import ettim.
import static com.emreilgar.constansts.RestApi.*;


@RestController
@RequestMapping("AUTH")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping(REGISTER)
    @CrossOrigin("*")
    public ResponseEntity<RegisterResponseDto> register(@RequestBody @Valid RegisterRequestDto dto){
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping(DOLOGIN)
    @CrossOrigin("*")
    //@CrossOrigin anotasyonu, ağdaki farklı URL'lerden yapılan isteklere izin vermek için kullanılır.
    // Bu anotasyon, sunucunuzun belirli bir URL'ye izin vermesine ve diğer URL'lerden gelen isteklere cevap vermemesine
    // olanak tanır. Bu, güvenliği arttırır ve aynı anda birden çok uygulamanın aynı sunucuda çalışmasını mümkün kılar.
    public ResponseEntity<String>doLogin(@RequestBody @Valid DoLoginRequestDto dto){
        return ResponseEntity.ok(authService.dologin(dto));
    }


}
