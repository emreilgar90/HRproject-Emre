package com.emreilgar.config.security;


import com.emreilgar.repository.entity.Auth;
import com.emreilgar.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class JwtUserDetails implements UserDetailsService {
    @Autowired
    AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
    public UserDetails getUserByAuthId(Long personalid){
        Optional<Auth> personal = authService.findById(personalid);

        if (personal.isEmpty()) return null;
        List<GrantedAuthority> authorities = new ArrayList<>();
        return User.builder()
                .username(personalid.toString())
                .password("")
                .accountLocked(false)
                .accountExpired(false)
                .authorities(authorities)
                .build();
    }
}
