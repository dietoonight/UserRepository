package org.example;

import java.util.List;

public interface UserRepository {
    User getById(int id);
    List<User> getAll();
    void add(User user);
    void update(User user);
    void delete(int id);
}
