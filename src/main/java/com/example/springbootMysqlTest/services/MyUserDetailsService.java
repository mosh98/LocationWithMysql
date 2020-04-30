package com.example.springbootMysqlTest.services;

import com.example.springbootMysqlTest.details.MyUserDetails;
import com.example.springbootMysqlTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {


            //Get's from the data-h base
            Optional<User> users = userRepository.findByUsername(s);

            users.orElseThrow(() -> new UsernameNotFoundException("Not found: " + s));

            //return users.get();
        return users.map(MyUserDetails::new).get();
    }

}
