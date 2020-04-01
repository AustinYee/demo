package com.yechangqing.demo.java.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
  @Update("update account set balance = balance + #{num} where id = #{id}")
  void update(int id, int num);
}
