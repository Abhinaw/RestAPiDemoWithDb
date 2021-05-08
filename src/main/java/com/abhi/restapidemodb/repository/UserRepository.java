package com.abhi.restapidemodb.repository;


import com.abhi.restapidemodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
