package com.yjq.vhr.controller.sys.basic;

import com.yjq.vhr.common.Result;
import com.yjq.vhr.model.Position;
import com.yjq.vhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/")
    public List<Position> getAll() {
        return positionService.getAll();
    }
    @PostMapping("/")
    public Result save(@RequestBody Position position) {
        if (positionService.save(position)==1){
            return Result.success("添加成功！");
        }
        return Result.error("添加失败！");
    }

    @PutMapping("/")
    public Result update(@RequestBody Position position) {
        if (positionService.update(position) == 1) {
            return Result.success("更新成功！");
        }
        return Result.error("更新失败！");
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        if (positionService.deleteById(id) == 1) {
            return Result.success("删除成功！");
        }
        return Result.error("删除失败！");
    }
    @DeleteMapping("/")
    public Result deleByIds(@RequestBody Integer[] ids) {
        if (positionService.deleteByIds(ids) == ids.length) {
            return Result.success("批量删除成功！");
        }
        return Result.error("批量删除失败！");
    }
}
