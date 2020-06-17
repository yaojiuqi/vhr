package com.yjq.vhr.controller.sys.basic;

import com.yjq.vhr.model.Department;
import com.yjq.vhr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/basic/dept")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/")
    public List<Department> getAllDepartmentsByParentId() {
        return departmentService.getAllDepartmentsByParentId(-1);
    }
}
