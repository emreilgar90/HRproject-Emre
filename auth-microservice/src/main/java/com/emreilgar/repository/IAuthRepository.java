package com.emreilgar.repository;

import com.emreilgar.repository.entity.Auth;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IAuthRepository extends MongoRepository<Auth,Long>{
    Optional<Auth> findOptionalByEmail(String email);

    Optional<Auth> findOptionalByEmailAndPassword(String email, String password);

    Optional<Auth> findOptionalById(Long id);

    Optional<Auth> findOptionalByUsername(String username);
}
