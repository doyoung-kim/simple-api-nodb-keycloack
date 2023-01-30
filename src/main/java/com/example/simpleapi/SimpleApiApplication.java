package com.example.simpleapi;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.session.HttpSessionEventPublisher;

@SpringBootApplication
public class SimpleApiApplication {	

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}


	@Bean
	public KeycloakConfigResolver KeycloakConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}
//
//	@Bean
//	public ServletListenerRegistrationBean<HttpSessionEventPublisher> httpSessionEventPublisher() {
//		return new ServletListenerRegistrationBean<HttpSessionEventPublisher>(new HttpSessionEventPublisher());
//	}
}
