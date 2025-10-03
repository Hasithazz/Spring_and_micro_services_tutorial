package com.springtutorial.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Pete", LocalDate.now().minusYears(35)));
        users.add(new User(3,"James", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

}
