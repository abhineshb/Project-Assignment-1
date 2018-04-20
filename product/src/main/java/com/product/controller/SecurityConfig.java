package com.product.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;*/
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@EnableWebSecurity
//@Configuration
public class SecurityConfig extends WebMvcConfigurerAdapter {
/*	@Autowired
	private AccessDeniedHandler accessDeniedHandler;
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http
	                .authorizeRequests()
						.antMatchers("/"
								+ "").hasAnyRole("USER")
						.anyRequest().authenticated()
	                .and()
	                .formLogin()
						.loginPage("/")
						.permitAll();
	        
	        
	        http.csrf().disable();
						
	        
	    }

	    // create two users, admin and user
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

	        auth.inMemoryAuthentication()
	                .withUser("user").password("password").roles("USER")
	                .and()
	                .withUser("admin").password("password").roles("ADMIN");
	    }*/
}
