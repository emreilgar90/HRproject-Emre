package com.emreilgar.service;

import com.emreilgar.dto.response.PersonelListResponseDto;
import com.emreilgar.exception.ErrorType;
import com.emreilgar.exception.UserProfileMicroserviceException;
import com.emreilgar.repository.IUserProfileRepository;
import com.emreilgar.repository.entity.UserProfile;
import com.emreilgar.utility.JwtTokenManager;
import com.emreilgar.utility.ServiceManager;


import org.springframework.stereotype.Service;



@Service
public class UserProfileService extends ServiceManager<UserProfile,String> {

    private final IUserProfileRepository repository;
    private final JwtTokenManager jwtTokenManager;





    public UserProfileService(IUserProfileRepository repository, JwtTokenManager jwtTokenManager){
        super(repository);
        this.repository = repository;
        this.jwtTokenManager = jwtTokenManager;

    }



}