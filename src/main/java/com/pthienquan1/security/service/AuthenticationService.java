package com.pthienquan1.security.service;

import com.pthienquan1.security.auth.AuthenticationRequest;
import com.pthienquan1.security.auth.AuthenticationResponse;
import com.pthienquan1.security.auth.RegisterRequest;
import com.pthienquan1.security.entity.Role;
import com.pthienquan1.security.entity.User;
import com.pthienquan1.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by quan0
 * Date 5/31/2023 - 1:46 PM
 * Description: ...
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;
    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
        
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
