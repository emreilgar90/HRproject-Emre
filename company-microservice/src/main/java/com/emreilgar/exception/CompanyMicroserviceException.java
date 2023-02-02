package com.emreilgar.exception;

import lombok.Getter;

@Getter
public class CompanyMicroserviceException extends RuntimeException{
    private final ErrorType errorType;

    public CompanyMicroserviceException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public CompanyMicroserviceException(ErrorType errorType, String message){
        super(message);   //AUTH microservice'i için özelleştirilmiş hata, bizim hesaplamadığımız hatalar olabilir.
        this.errorType=errorType;
    }
}
