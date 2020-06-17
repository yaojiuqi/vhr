package com.yjq.vhr.controller.sys.basic;

import com.yjq.vhr.common.Result;
import com.yjq.vhr.model.JobLevel;
import com.yjq.vhr.service.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAll() {
        return jobLevelService.getAll();
    }

    @PostMapping("/")
    public Result save(@RequestBody JobLevel jobLevel) {
        if (jobLevelService.save(jobLevel) == 1) {
            return Result.success("添加成功！");
        }
        return Result.error("添加失败！");
    }

    @PutMapping("/")
    public Result update(@RequestBody JobLevel jobLevel) {
        if (jobLevelService.update(jobLevel) == 1) {
            return Result.success("更新成功！");
        }
        return Result.error("更新失败！");
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        if (jobLevelService.deleteById(id) == 1) {
            return Result.success("删除成功！");
        }
        return Result.error("删除失败！");
    }

    @DeleteMapping("/")
    public Result deleteByIds(@RequestBody Integer[] ids) {
        if (jobLevelService.deleteByIds(ids) == ids.length) {
            return Result.success("删除成功！");
        }
        return Result.error("删除失败！");
    }
}
