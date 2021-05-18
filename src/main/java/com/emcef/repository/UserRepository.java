/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import com.emcef.model.User;
import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Holy
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    //@Query(value = "SELECT * FROM  user WHERE username =:username AND password =:password", nativeQuery = true)
    //JSONObject informationsUtilisateur(@Param("username") String username,@Param("password") String password);
}
