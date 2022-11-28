package com.eteration.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteration.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
