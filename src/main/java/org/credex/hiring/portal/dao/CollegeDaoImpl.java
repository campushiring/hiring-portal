package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Colleges;
import org.credex.hiring.portal.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class CollegeDaoImpl implements CollegeDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    @Transactional
    public Colleges createCollege(Colleges colleges) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(colleges);
        }finally {
            session.flush();
        }
        return colleges;

    }
    @Override
    @Transactional
    public Colleges updateCollege(Colleges colleges) {

        Session session = sessionFactory.getCurrentSession();

            Object ob = session.get(Colleges.class, colleges.getCollegeId());
            Colleges cl = (Colleges) ob;
            BeanUtils.copyProperties(cl, colleges);
            return colleges;
    }
    @Override
    @Transactional(readOnly = true)
    public String  deleteCollege(int collegeId) {
        Session session = sessionFactory.getCurrentSession();
        Object ob = (Object) session.load(Colleges.class,collegeId);
        session.delete(ob);
        session.flush();
        return "This is deleted";
    }


    @Override
    @Transactional
    public List<Colleges> getAllCollege() {
        Session session = sessionFactory.getCurrentSession();
        Query<Colleges> query = session.createQuery("FROM Colleges", Colleges.class);
        List<Colleges> colleges = query.getResultList();
        return colleges;
    }
}
