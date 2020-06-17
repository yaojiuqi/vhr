package com.yjq.vhr.exception;

import com.yjq.vhr.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    public Result sqlException(SQLException e){
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return Result.error("添加失败，此记录已存在");
        }
        return Result.error("数据库异常，操作失败");
    }
}
