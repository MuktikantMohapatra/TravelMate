package com.login.entity.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.entity.repos.UserRepository;

public class UserServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			UserDetails userDetails = (UserDetails) userRepository.findByUserName(username);
			if (userDetails == null) {
				throw new UsernameNotFoundException("User Name is not valid..");
			}
			return userDetails;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
