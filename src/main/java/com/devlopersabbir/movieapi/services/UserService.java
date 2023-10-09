package com.devlopersabbir.movieapi.services;
import com.devlopersabbir.movieapi.entity.User;
import com.devlopersabbir.movieapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User storeUser(User user){
        repository.save(user);
        return user;
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }
}
