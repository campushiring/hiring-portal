package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.CampusType;

import java.util.Map;

public interface CampusDao {
    Map<String, Long> getCounts();
}
