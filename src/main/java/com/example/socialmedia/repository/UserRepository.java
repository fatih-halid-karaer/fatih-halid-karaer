package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.entities.User;



public interface UserRepository extends JpaRepository<User, Integer>{

}
