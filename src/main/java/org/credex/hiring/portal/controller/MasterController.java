package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.RoleDao;
import org.credex.hiring.portal.model.Role;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class MasterController {

    @Autowired
    private RoleDao roleDao;
    @PostMapping(value = "/add")
    public Role createRole(@RequestBody Role role) {
        return roleDao.createRole(role);
    }
    @GetMapping("/get")
    public List<Role> getAllRole() {
        return roleDao.getAllRole();
    }
}
