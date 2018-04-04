package com.chenquan.dao;

import com.chenquan.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据ID查找User对象
     * @param:userId
     * @return:User
     */
    User selectByPrimaryKey(Integer userId);
    
    /**
     * 查询所有的员工User
     * @return List<User>
     */
    List<User> selectUsers();
}