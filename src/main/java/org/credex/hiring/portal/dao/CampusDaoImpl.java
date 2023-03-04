package org.credex.hiring.portal.dao;
import org.credex.hiring.portal.model.Chart;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Repository
public class CampusDaoImpl implements CampusDao {
    @Autowired
    private SessionFactory sessionFactory;
    //Session session = sessionFactory.getCurrentSession();
    @Override
    public Chart countSelectedStudents(@RequestParam(name = "selected_Id", required = false)Integer selected_Id) {
        Session session = sessionFactory.getCurrentSession();
        if (selected_Id == null) {
            return null;
        }
        Chart ch = session.get(Chart.class, selected_Id);
        return ch;
    }

    @Override
    public Map<String, Integer> countCampusTypes() {
        //Session session = sessionFactory.getCurrentSession();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("simr",1);
        return map1;
    }
}
