package com.yjq.vhr.mapper;

import com.yjq.vhr.model.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getSelectMenuIds(Integer id);

}
