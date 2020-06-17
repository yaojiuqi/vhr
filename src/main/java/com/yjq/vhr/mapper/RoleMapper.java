package com.yjq.vhr.mapper;

import com.yjq.vhr.model.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> getAll();

    Integer add(Role role);

    Integer deleteRoleById(Integer id);
}
