package com.login.entity.repos;

import java.sql.SQLException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//Over loaded method of JpaRepository
	User findByUserName(String userName)throws SQLException;
	//Over loaded method of JpaRepository
	User findByEmail(String email)throws SQLException;
}
