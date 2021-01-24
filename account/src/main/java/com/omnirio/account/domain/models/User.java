package com.omnirio.account.domain.models;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {
    private boolean enabled = true;
    
    private String userId;
    private String userName;
    private String password;
    
    private Date dateOfBirth;
    private char gender; // 'M' or 'F'

    public String getId() {
        return userId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return enabled;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return enabled;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}