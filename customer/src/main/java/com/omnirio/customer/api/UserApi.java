package com.omnirio.customer.api;

import com.omnirio.customer.domain.models.User;
import java.util.Collections;
import java.util.List;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "api/users")
public class UserApi {
    
    @GetMapping("me")
    public User me() {
        return (User) SecurityContextHolder
            .getContext()
            .getAuthentication()
            .getPrincipal();
    }
    
    @GetMapping("/")
    @Secured({ "BRANCH_MANAGER" })
    public List<User> listUsers() {
        return Collections.singletonList(new User());    
    }

    @PutMapping("/{userId}")
    @Secured( { "BRANCH_MANAGER" } )
    public void modifyUser(@PathVariable String userId) {
        
    }
}