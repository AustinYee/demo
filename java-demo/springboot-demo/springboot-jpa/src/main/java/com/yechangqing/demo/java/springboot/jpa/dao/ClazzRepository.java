package com.yechangqing.demo.java.springboot.jpa.dao;

import com.yechangqing.demo.java.springboot.jpa.entity.ClazzEntity;
import com.yechangqing.demo.java.springboot.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<ClazzEntity, Long> {

}
