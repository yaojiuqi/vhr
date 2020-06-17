package com.yjq.vhr.mapper;

import com.yjq.vhr.model.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> getAllDepartmentsByParentId(int pid);
}
