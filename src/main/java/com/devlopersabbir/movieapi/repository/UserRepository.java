package com.devlopersabbir.movieapi.repository;
import com.devlopersabbir.movieapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends  JpaRepository<User, Integer>{

}
