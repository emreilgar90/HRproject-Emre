package com.emreilgar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class FallbackController {
    @GetMapping("/fallbackauth")
    public ResponseEntity<String> fallbackauth(){
        return ResponseEntity.ok("Servis şuan çalışmıyor.Daha sonra tekrar deneyin.");
    }
    @GetMapping("/fallbackuser")
    public ResponseEntity<String>fallbackuser(){
        return ResponseEntity.ok("Servis şuan çalışmıyor.Daha sonra tekrar deneyin.");
    }
}
