package com.example.SpringBootDemo.dao;

import java.util.List;

import com.example.SpringBootDemo.bean.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDaoMapper {

    /**
     * 查询所有用户信息
     * @return 所有用户信息列表
     */
    List<UserInfo> findAll();

    /**
     * 根据主键id删除
     * @param id
     * @return
     */
    int deleteById(Long id);
}