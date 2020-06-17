package com.yjq.vhr.mapper;

import com.yjq.vhr.model.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionMapper {
    List<Position> getAll();

    Integer deleteById(Integer id);

    Integer save(Position position);

    Integer update(Position position);

    Integer deleteByIds(@Param("ids") Integer[] ids);
}
