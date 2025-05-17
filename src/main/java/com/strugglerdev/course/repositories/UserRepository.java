package com.strugglerdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.strugglerdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long > {

}
