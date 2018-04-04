package com.chenquan.service;

import com.chenquan.entity.User;

import java.util.List;

/**
 * @author 陈泉
 * @Date 2018/4/4 0004下午 3:10
 * @
 */

public interface UserService {

    /**
     * 根据id查找User对象
     * @param:userid
     * @return User
     */
    User queryUserById(int userid);

    /**
     * 查询所有的员工User
     * @return List<User>
     */
    List<User> selectUsers();
    
    
}
