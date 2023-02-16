package com.emreilgar.controller;

import com.emreilgar.dto.response.PersonelListResponseDto;
import com.emreilgar.repository.entity.Job;
import com.emreilgar.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("USER")
@RequiredArgsConstructor
public class UserController {

    private final UserProfileService userProfileService;


    @GetMapping("/UserProfile/{Job}")
    public ResponseEntity<List<PersonelListResponseDto>>getUserProfile(@PathVariable Job job){
        return ResponseEntity.ok(userProfileService.getClass());
    }
}
