package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Chart;

import javax.persistence.Id;
import java.util.Map;
public interface CampusDao {
    Chart countSelectedStudents(Integer selected_Id);
    Map<String, Integer> countCampusTypes();
}
