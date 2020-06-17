package com.yjq.vhr.mapper;

import com.yjq.vhr.model.Hr;
import com.yjq.vhr.model.Role;

import java.util.List;

public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getHrRolesByHrId(Integer id);
}
