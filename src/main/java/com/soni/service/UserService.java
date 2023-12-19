package com.soni.service;

import com.zosh.exception.UserException;
import com.zosh.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
