package com.pthienquan1.security.auth;

import lombok.*;

/**
 * Created by quan0
 * Date 5/31/2023 - 1:39 PM
 * Description: ...
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
    private String token;
}
