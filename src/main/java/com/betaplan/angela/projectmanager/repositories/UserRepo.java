package com.betaplan.angela.projectmanager.repositories;

import java.util.List;
import java.util.Optional;

import com.betaplan.angela.projectmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
    User findByIdIs(Long id);
}
