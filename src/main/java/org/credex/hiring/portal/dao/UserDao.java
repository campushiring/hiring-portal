package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Users;

import java.util.List;


public interface UserDao {
    void saveUser(Users user);

    Users createUser(Users user);
//    void updateUser(Users user);
//    void deleteUser(int userId);
//    Users getUserById(int userId);
//    List<Users> getAllUsers();
}
