package com.product.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.product.model.UserDetail;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;*/
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	
	
		
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
		 System.out.println("=================http");
     http.authorizeRequests().antMatchers("/").hasAnyRole("USER", "ADMIN")
		.and().formLogin().loginPage("/login").permitAll();
		

http.csrf().disable();
						
	        
	    }
	 @Override
	  public void configure(WebSecurity web) throws Exception {
	    web
	      .ignoring()
	         .antMatchers("/resources/**"); // #3
	  }
	    // create two users, admin and user
	 @Autowired
		public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		 System.out.println("=================authenticationMgr");
			//BCryptPasswordEncoder pwd =new BCryptPasswordEncoder();
		//	authenticationMgr.userDetailsService(user).passwordEncoder(pwd);
		 authenticationMgr
			.inMemoryAuthentication()
			.withUser("joe")
			.password("joe")
.roles("USER","ADMIN");
		
		}

}
