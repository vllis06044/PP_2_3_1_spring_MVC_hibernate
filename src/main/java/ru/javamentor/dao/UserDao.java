package ru.javamentor.dao;

import ru.javamentor.entities.User;
import java.util.List;

public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(Long id);
    User findById(Long id);
    List<User> findAll();
}