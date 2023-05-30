package com.pthienquan1.security.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

/**
 * Created by quan0
 * Date 5/30/2023 - 8:52 PM
 * Description: ...
 */
@Service
public class JwtService {
    private static final String SECRET_KEY = "4A614E645266556A586E3272357538782F413F4428472B4B6250655368566B59";
    public String extractUsername(String jwt) {
        return null;
    }
    public Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();


    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
