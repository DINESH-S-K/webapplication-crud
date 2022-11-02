package com.example.webapplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.webapplication.model.UserData;

public interface UserDAO extends CrudRepository<UserData, Integer> {

}
