package com.taslim.jpa.repository;


import com.taslim.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJPARepository extends JpaRepository<User,Long> {

    User findByName(String name);
}
