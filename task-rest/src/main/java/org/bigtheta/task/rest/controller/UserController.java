package org.bigtheta.task.rest.controller;

import org.bigtheta.task.rest.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private static Map<Integer, User> users = new HashMap<>();

    static {
        users.put(1, new User(1, "eric", "7!jd#h23"));
        users.put(2, new User(2, "ivan", "34j0f8j3"));
        users.put(3, new User(3, "petr", "5jk30438"));
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return users.getOrDefault(id, new User(-1, "unknown", "no pass"));
    }
}
