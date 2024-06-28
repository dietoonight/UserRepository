package org.example.Profiles;

import org.example.User;
import org.example.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Profile("hashmap")
public class HashMapUserRepository implements UserRepository {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public User getById(int id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll() {
       return users.values().stream().collect(Collectors.toList());
    }
    @Override
    public void add(User user){
        users.put(user.getId(), user);
    }
    @Override
    public void update(User user){
        users.put(user.getId(), user);
    }

    @Override
    public void delete(int id) {
        users.remove(id);
    }
}
