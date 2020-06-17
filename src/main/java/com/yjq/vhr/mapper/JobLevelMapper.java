package com.yjq.vhr.mapper;

import com.yjq.vhr.model.JobLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobLevelMapper {
    List<JobLevel> getAll();

    Integer save(JobLevel jobLevel);

    Integer update(JobLevel jobLevel);

    Integer deleteById(Integer id);

    Integer deleteByIds(@Param(value = "ids") Integer[] ids);
}
