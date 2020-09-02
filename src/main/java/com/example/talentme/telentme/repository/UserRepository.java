package com.example.talentme.telentme.repository;

import com.example.talentme.telentme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
