package com.product.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetail implements UserDetailsService {

	private Map<String, String> users = new HashMap<String, String>() {
		{
			put("user1", "password");
			put("user2", "password");
		}
	};

	public Map<String, String> getUsers() {
		return users;
	}

	String userId, password;

	public UserDetail() {

	}

	public UserDetail(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("======  " + arg0);
		UserDetail u = new UserDetail();
		u.setUserId(arg0);
		u.setPassword(u.users.get(arg0));
		return (UserDetails) u;

	}

}
