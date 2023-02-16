package com.emreilgar.repository;

import com.emreilgar.repository.entity.Job;
import com.emreilgar.repository.entity.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IUserProfileRepository extends MongoRepository<UserProfile,Long> {
    Optional<UserProfile> findOptionalByEmail(String email);

    Optional<UserProfile> findOptionalByEmailAndPassword(String email, String password);

    Optional<UserProfile> findOptionalById(Long id);

    Optional<UserProfile> findOptionalByUsername(String username);

    Optional<UserProfile> findOptionalByAuthid(Long id);


}
