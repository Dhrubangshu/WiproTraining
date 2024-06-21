package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.dao.UserRepository;
import com.wipro.entity.User;
import com.wipro.exception.UserException;

public class UserServiceCrudImpl implements UserService {
       
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User getUserById(Integer userid) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Integer userID) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
