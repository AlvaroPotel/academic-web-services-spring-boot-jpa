package com.example.academicspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.academicspringjpa.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
