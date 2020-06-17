package com.yjq.vhr.controller.sys.basic;

import com.yjq.vhr.common.Result;
import com.yjq.vhr.model.Menu;
import com.yjq.vhr.model.Role;
import com.yjq.vhr.service.MenuService;
import com.yjq.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;
    @GetMapping("/")
    public List<Role> getAllRoles(){
        return roleService.getAll();
    }
    @PostMapping("/")
    public Result addRole(@RequestBody Role role){
        if (roleService.add(role) == 1) {
            return Result.success("添加角色成功！");
        }
        return Result.error("添加角色失败！");
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/menus/{id}")
    public List<Integer> getSelectMenuIds(@PathVariable Integer id){
        return menuService.getSelectMenuIds(id);
    }

    @PutMapping("/menus/{rid}")
    public Result updateMenuRole(@PathVariable Integer rid, @RequestBody Integer[] mids) {
        if (menuService.updateMenuRole(rid, mids)) {
            return Result.success("更新成功！");
        }
        return Result.error("更新失败！");
    }

    @DeleteMapping("/menus/{rid}")
    public Result deleteRoleById(@PathVariable Integer rid) {
        if (menuService.deleteRoleById(rid)==1) {
            return Result.success("删除成功！");
        }
        return Result.error("删除失败！");
    }
}
