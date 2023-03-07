package org.credex.hiring.portal.service;

import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(Users user) {
        userDao.saveUser(user);
    }

//    @Override
//    public void updateUser(Users user) {
//        userDao.updateUser(user);
//    }
//
//    @Override
//    public void deleteUser(int userId) {
//        userDao.deleteUser(userId);
//    }
//
//    @Override
//    public Users getUserById(int userId) {
//        return userDao.getUserById(userId);
//    }
//
//    @Override
//    public List<Users> getAllUsers() {
//        return userDao.getAllUsers();
//    }
}

