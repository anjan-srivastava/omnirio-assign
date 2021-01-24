package com.omnirio.customer.domain.models;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {
    private boolean enabled = true;
    
    private String userId = "god";
    private String userName = "god";
    private String password = "$2y$12$HMgdxRPDhvCQ.anMdn.EKOIEjOB0aY0g90C6HpqhqGLHLbRQoyFlC";
    
    private Date dateOfBirth;
    private char gender; // 'M' or 'F'
    private Role role;
    
    public String getId() {
        return userId;
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