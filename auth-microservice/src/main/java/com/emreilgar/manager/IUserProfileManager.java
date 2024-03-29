package com.emreilgar.manager;

import com.emreilgar.dto.request.CreateProfileRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * isimlendirme benzersiz uniq olmalıdır.
 */
@FeignClient(name = "user-profile-manager"
        ,url = "${myapplication.user.feignurl}"
        ,decode404 = true)
public interface IUserProfileManager {

    @PostMapping("/createprofile")
    ResponseEntity<String> createProfile(@RequestBody @Valid CreateProfileRequestDto dto);

}
