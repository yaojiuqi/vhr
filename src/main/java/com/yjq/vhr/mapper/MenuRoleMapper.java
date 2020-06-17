package com.yjq.vhr.mapper;

import org.apache.ibatis.annotations.Param;

public interface MenuRoleMapper {
    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid,@Param("mids") Integer[] mids);
}
