package com.emreilgar.repository;

import com.emreilgar.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAuthRepository extends JpaRepository {
    Optional<Auth> findOptionalByEmail(String email);

    Optional<Auth> findOptionalByEmailAndPassword(String email, String password);

    Optional<Auth> findOptionalById(Long id);

    Optional<Auth> findOptionalByUsername(String username);
}
