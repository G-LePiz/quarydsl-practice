package com.example.quarydsl.domain.user.repository;

import com.example.quarydsl.domain.user.entity.User;

import java.util.List;

public interface UserRepositoryQuary {

    List<User> findAllUsers();
}
