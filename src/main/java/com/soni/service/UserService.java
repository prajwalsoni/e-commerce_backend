package com.soni.service;

import com.soni.exception.UserException;
import com.soni.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
