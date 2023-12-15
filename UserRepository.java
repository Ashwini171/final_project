package com.repository;

//UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
 // You can add custom queries if needed
}
