package org.credex.hiring.portal.dao;
import org.credex.hiring.portal.model.CampusType;
import org.credex.hiring.portal.model.Chart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.HashMap;
import java.util.Map;


@Repository
public class CampusDaoImpl implements CampusDao {
    @Autowired
    private SessionFactory sessionFactory;
    //Session session = sessionFactory.getCurrentSession();
    @Override
    @Transactional
    public Map<String, Long> getCounts() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> cqSelectedStudents = cb.createQuery(Long.class);
        Root<Chart> rootSelectedStudents = cqSelectedStudents.from(Chart.class);
        cqSelectedStudents.select(cb.count(rootSelectedStudents.get("selectedStudents")));
        Long selectedStudentsCount = session.createQuery(cqSelectedStudents).getSingleResult();

        CriteriaQuery<Long> cqCampusTypes = cb.createQuery(Long.class);
        Root<Chart> rootCampusTypes = cqCampusTypes.from(Chart.class);
        cqCampusTypes.select(cb.count(rootCampusTypes.get("id"))).where(cb.equal(rootCampusTypes.get("campusType"), CampusType.ON));
        Long onCampusCount = session.createQuery(cqCampusTypes).getSingleResult();

        Map<String, Long> countsMap = new HashMap<>();
        countsMap.put("selectedStudentsCount", selectedStudentsCount);
        countsMap.put("onCampusCount", onCampusCount);
        return countsMap;
    }
}
