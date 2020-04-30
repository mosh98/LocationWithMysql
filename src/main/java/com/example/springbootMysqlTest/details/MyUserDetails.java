package com.example.springbootMysqlTest.details;

import com.example.springbootMysqlTest.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;


public class MyUserDetails implements UserDetails {

    private String username;
    private String password;
    private boolean active;
   // private List<GrantedAuthority> authorities;


    public MyUserDetails(User user){
        this.username = user.getUserName();
        this.password = user.getPassword();
        this.active = user.isActive();
    }


    public MyUserDetails(org.springframework.security.core.userdetails.User user) {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}
