package com.upgrad.miniproject.repository;

import com.upgrad.miniproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}