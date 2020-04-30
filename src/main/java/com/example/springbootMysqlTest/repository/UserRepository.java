package com.example.springbootMysqlTest.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository("user")
public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String userName);

}
