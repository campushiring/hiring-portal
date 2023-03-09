package org.credex.hiring.portal.controller;

import org.codehaus.jackson.annotate.JsonValue;
import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Users;
import org.credex.hiring.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.enterprise.inject.Model;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users createUser(@RequestBody Users user) {
        return userDao.createUser(user);

    }
    @GetMapping("/allusers")
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/usersbyId/{userId}")
    public Users getUserById(@PathVariable int userId) {
        return userDao.getUserById(userId);
    }


    @PutMapping("/update/users")
    public Users updateUser(@RequestParam int userId, @RequestBody Users user) {
        return userDao.updateUser(user);
    }

    @DeleteMapping("/delete/users/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
       return userDao.deleteUser(userId);
    }
}
