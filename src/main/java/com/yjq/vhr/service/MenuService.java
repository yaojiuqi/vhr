package com.yjq.vhr.service;

import com.yjq.vhr.mapper.MenuMapper;
import com.yjq.vhr.mapper.MenuRoleMapper;
import com.yjq.vhr.mapper.RoleMapper;
import com.yjq.vhr.model.Hr;
import com.yjq.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;
    @Autowired
    RoleMapper roleMapper;
    public List<Menu> getMenuByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
//  最好加上缓存
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getSelectMenuIds(Integer id) {
        return menuMapper.getSelectMenuIds(id);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if (mids.length!=0) {
            Integer result = menuRoleMapper.insertRecord(rid, mids);
            return result == mids.length;
        }
        return true;
    }
    @Transactional
    public Integer deleteRoleById(Integer rid) {
        menuRoleMapper.deleteByRid(rid);
        Integer result = roleMapper.deleteRoleById(rid);
        return result;
    }
}
