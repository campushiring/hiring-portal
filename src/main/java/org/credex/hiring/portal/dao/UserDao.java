package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Users;

import java.util.List;


public interface UserDao {
    Users createUser(Users user);
    Users updateUser(Users user);
    Users getUserById(int userId);
    String deleteUser(int userId);
    List<Users> getAllUsers();
}
