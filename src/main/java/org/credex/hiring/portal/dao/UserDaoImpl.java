package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    @Transactional
    public Users createUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        return user;
    }

//    @Override
//    public void updateUser(Users user) {
//        Session session = sessionFactory.getCurrentSession();
//        session.update(user);
//    }
//
//
//    @Override
//    public void deleteUser(int userId) {
//        Session session = sessionFactory.getCurrentSession();
//        Users user = getUserById(userId);
//        session.delete(user);
//    }
//
//    @Override
//    public Users getUserById(int userId) {
//        Session session = sessionFactory.getCurrentSession();
//        Users user = session.get(Users.class, userId);
//        return user;
//    }
//
//    @Override
//    public List<Users> getAllUsers() {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Users> query = session.createQuery("FROM Users", Users.class);
//        List<Users> users = query.getResultList();
//        return users;
//    }
}
