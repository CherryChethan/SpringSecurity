package com.luvcode.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class DemoSecurity 
                   extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our user for in memory atentication
		UserBuilder users=User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		      .withUser(users.username("chethan").password("stsk").roles("EMPLOYEE"))
		      .withUser(users.username("nithya").password("stsk").roles("HR"))
		      .withUser(users.username("divya").password("stsk").roles("ADMIN")); 
	}
	
	

}
