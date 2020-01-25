package com.bkt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bkt.Entites.UserEntity;
import com.bkt.repositories.UserInfoRepo;

@Service
public class UserInfoService implements UserService {

	@Autowired
	private UserInfoRepo repo;

	@Override
	public UserEntity getUser(String userName) {

		UserEntity user = repo.findById(userName).orElse(new UserEntity());

		return user;
	}

}
