package com.bkt.services;

import com.bkt.Entites.UserEntity;
public interface UserService 
{
	public abstract UserEntity getUser(String userName);
}
