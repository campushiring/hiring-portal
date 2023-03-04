package org.credex.hiring.portal.controller;
import java.util.HashMap;
import java.util.Map;

import org.credex.hiring.portal.model.Chart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.credex.hiring.portal.dao.CampusDao;

@RestController
@RequestMapping("/api/campuses")
public class ChartController {
    @Autowired
    private CampusDao campusDao;

    @GetMapping("/counts")
    public Chart getCampusCounts(@RequestParam(name = "selected_Id", required = false) Integer selected_Id) {
        return campusDao.countSelectedStudents(selected_Id);
    }

    // Other REST endpoints
}

