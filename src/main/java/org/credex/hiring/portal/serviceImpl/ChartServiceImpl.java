package org.credex.hiring.portal.service;
import org.credex.hiring.portal.dao.CampusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ChartServiceImpl implements ChartService {
    @Autowired
    private CampusDao campusDao;


    @Override
    @Transactional
    public Long countSelectedStudents(int user_id) {
        return campusDao.countSelectedStudents(user_id);
    }

    @Override
    public Long countCampusTypes(String CampusType) {
        return campusDao.countCampusTypes(CampusType);
    }
}
