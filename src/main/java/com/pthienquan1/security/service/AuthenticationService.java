package com.pthienquan1.security.service;

import com.pthienquan1.security.auth.AuthenticationRequest;
import com.pthienquan1.security.auth.AuthenticationResponse;
import com.pthienquan1.security.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by quan0
 * Date 5/31/2023 - 1:46 PM
 * Description: ...
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request) {

    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
