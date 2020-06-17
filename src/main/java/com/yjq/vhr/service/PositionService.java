package com.yjq.vhr.service;

import com.yjq.vhr.mapper.PositionMapper;
import com.yjq.vhr.model.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAll() {
        return positionMapper.getAll();
    }
    public Integer deleteById(Integer id) {
        return positionMapper.deleteById(id);
    }

    public Integer save(Position position) {
        return positionMapper.save(position);
    }

    public Integer update(Position position) {
        return positionMapper.update(position);
    }

    public Integer deleteByIds(Integer[] ids) {
        return positionMapper.deleteByIds(ids);
    }
}
