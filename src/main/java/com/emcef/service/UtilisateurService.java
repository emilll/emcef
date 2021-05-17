package com.emcef.service;

import com.emcef.repository.UtilisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository uRepository;

}
