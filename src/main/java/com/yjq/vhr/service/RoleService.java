package com.yjq.vhr.service;

import com.yjq.vhr.mapper.RoleMapper;
import com.yjq.vhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAll() {
        return roleMapper.getAll();
    }

    public Integer add(Role role) {
        return roleMapper.add(role);
    }
}
