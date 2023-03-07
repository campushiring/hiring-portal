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

//    @GetMapping("/users")
//    public List<Users> getAllUsers() {
//        return userDao.getAllUsers();
//    }
//
//    @GetMapping("/users/{userId}")
//    public Users getUserById(@PathVariable int userId) {
//        return userDao.getUserById(userId);
//    }

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users createUser(@RequestBody Users user) {
      return userDao.createUser(user);

    }

//    @PutMapping("/users/{userId}")
//    public void updateUser(@PathVariable int userId, @RequestBody Users user) {
//        user.setUserid(userId);
//        userDao.updateUser(user);
//    }
//
//    @DeleteMapping("/users/{userId}")
//    public void deleteUser(@PathVariable int userId) {
//        userDao.deleteUser(userId);
//    }
}
