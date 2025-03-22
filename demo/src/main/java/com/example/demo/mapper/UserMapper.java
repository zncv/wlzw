package com.example.demo.mapper;

import com.example.demo.bean.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

@Mapper
public interface UserMapper {
    public TUser getUserById(@Param("id") Long id);
}
