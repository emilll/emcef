/*
 * Copyright 2021 Emmanuel, Flutter, Spring-Boot.
 *
 * BOSSOU Emmanuel
 * Projet Emcef
 * JSCOM
 *
 *      https://www.jscom.bj
 *
 * Ce code source est propriétaire.
 * Ne pas copier ou reproduire d'une quelconque manière ce code source.
 */
package com.emcef.utility;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 *
 * @author Emmanuel, Flutter, Spring-Boot
 */
@Configuration
public class CorsConfig {
    @Bean
    public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration cfg = new CorsConfiguration();
        cfg.addAllowedOriginPattern("*"); cfg.setAllowCredentials(true);
        cfg.addAllowedHeader("*"); cfg.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", cfg);
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }
}
