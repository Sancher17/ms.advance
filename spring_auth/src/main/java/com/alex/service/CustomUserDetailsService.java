package com.alex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService {

//    private final UserRepository userRepository;

    public UserDetails getUserByEmail(String email) throws BadCredentialsException {
        return null;
//        return userRepository
//                .findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
    }
}
