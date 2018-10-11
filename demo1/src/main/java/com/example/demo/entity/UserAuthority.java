package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonView;

@JsonView(View.Anonymous.class)
public class UserAuthority implements GrantedAuthority {
	
	private static final long serialVersionUID = -2439656695932342412L;
	
	String authority;

	public UserAuthority(String a) {
		this.authority = a;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return authority;
	}
	
}