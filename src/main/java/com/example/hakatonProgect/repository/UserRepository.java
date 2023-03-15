package com.example.hakatonProgect.repository;

import com.example.hakatonProgect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
