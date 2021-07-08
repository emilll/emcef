/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

/**
 *
 * @author Holy
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.emcef.model.User;
import com.emcef.model.UserPrincipal;
import com.emcef.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        
        return new UserPrincipal(user);

    }

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
    
    public User getUserByIfu(String ifu) {
        return userRepository.findByIfu(ifu);
    }
    
    public User getUserByKey(String key) {
        return userRepository.findByApiKey(key);
    }
}
