package com.yjq.vhr.service;

import com.yjq.vhr.mapper.DepartmentMapper;
import com.yjq.vhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getAllDepartmentsByParentId(int pid) {
        return departmentMapper.getAllDepartmentsByParentId(pid);
    }
}
