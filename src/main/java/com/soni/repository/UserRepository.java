package com.soni.repository;


import org.springframework.data.jpa.repository.JpaRepository; 

import com.soni.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
