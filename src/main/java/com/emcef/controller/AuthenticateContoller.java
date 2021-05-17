package com.emcef.controller;

import com.emcef.JWTentity.AuthRequest;
import com.emcef.JWTentity.AuthResponse;
import com.emcef.JWTentity.Utilisateur;
import com.emcef.service.CustomUserDetailsService;
import com.emcef.util.Jwtutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateContoller {

    Jwtutil jwtutil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userService;

    @PostMapping("/authenticate")
    public AuthResponse generateToken(@Validated @RequestBody AuthRequest authRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getMdp()));

        } catch (Exception ex) {
            throw new Exception("Nom d'utilisateur et le mot de passe sont invilide");
        }

        final UserDetails userDetails = userService.loadUserByUsername(authRequest.getUsername());

        jwtutil = new Jwtutil();
        final String token = jwtutil.generateToken(userDetails);

        return new AuthResponse(token);

    }

    @PostMapping("/user")
    public Utilisateur gUtilisateur(String username) {
        return userService.getUtilisateur(username);
    }
}
