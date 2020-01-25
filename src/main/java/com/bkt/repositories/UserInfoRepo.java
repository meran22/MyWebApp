package com.bkt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bkt.Entites.UserEntity;
@Repository
public interface UserInfoRepo extends CrudRepository<UserEntity, String>
{
}

