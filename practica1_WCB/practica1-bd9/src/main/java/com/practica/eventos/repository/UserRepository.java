package com.practica.eventos.repository;

import com.practica.eventos.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User save(User user) {
        users.add(user);
        return user;
    }

    public void deleteById(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
