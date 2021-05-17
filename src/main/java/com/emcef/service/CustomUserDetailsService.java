package com.emcef.service;

import java.util.ArrayList;

import com.emcef.JWTentity.Utilisateur;
import com.emcef.repository.UtilisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UtilisateurRepository repository;

    // get user from base de données
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = repository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(utilisateur.getUsername(), utilisateur.getMdp(),
                new ArrayList<>());
    }

    public Utilisateur getUtilisateur(String username) {
        return repository.findByUsername(username);
    }
}
