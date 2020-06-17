package com.yjq.vhr.service;

import com.yjq.vhr.mapper.JobLevelMapper;
import com.yjq.vhr.model.JobLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper jobLevelMapper;
    public List<JobLevel> getAll() {
        return jobLevelMapper.getAll();
    }


    public Integer save(JobLevel jobLevel) {
        return jobLevelMapper.save(jobLevel);
    }

    public Integer update(JobLevel jobLevel) {
        return jobLevelMapper.update(jobLevel);
    }

    public Integer deleteById(Integer id) {
        return jobLevelMapper.deleteById(id);
    }

    public Integer deleteByIds(Integer[] ids) {
        return jobLevelMapper.deleteByIds(ids);
    }
}
