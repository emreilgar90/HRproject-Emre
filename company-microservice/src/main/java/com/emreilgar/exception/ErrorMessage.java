package com.emreilgar.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class ErrorMessage {  //bu class'ı bütün projelerinde özelleştirip kullanabilirsin.

    int code;
    String message;
    List<String>fields;

}
