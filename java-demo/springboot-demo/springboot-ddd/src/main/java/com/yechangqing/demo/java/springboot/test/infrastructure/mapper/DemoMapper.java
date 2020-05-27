package com.yechangqing.demo.java.springboot.test.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yechangqing.demo.java.springboot.test.infrastructure.entity.DemoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper extends BaseMapper <DemoEntity>{
  @Insert("insert into `demo` values (#{id}, #{name}, #{age} , #{birthday} )")
  boolean save(DemoEntity entity);
}
