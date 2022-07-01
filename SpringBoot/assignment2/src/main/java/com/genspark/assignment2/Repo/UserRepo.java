package com.genspark.assignment2.Repo;

import com.genspark.assignment2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
