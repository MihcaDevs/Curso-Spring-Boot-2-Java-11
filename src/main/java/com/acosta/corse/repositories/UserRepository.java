package com.acosta.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acosta.corse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
