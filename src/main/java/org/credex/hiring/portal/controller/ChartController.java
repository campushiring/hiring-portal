package org.credex.hiring.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.credex.hiring.portal.dao.CampusDao;

import java.util.Map;

@RestController
@RequestMapping("/api/campuses")
public class ChartController {
    @Autowired
    private CampusDao campusDao;

    @GetMapping("/counts")
    public Map<String, Long> getCounts() {
        return campusDao.getCounts();
    }
}

