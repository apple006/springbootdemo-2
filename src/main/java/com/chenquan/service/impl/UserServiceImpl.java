package com.chenquan.service.impl;

import com.chenquan.dao.UserDAO;
import com.chenquan.entity.User;
import com.chenquan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈泉
 * @Date 2018/4/4 下午 3:12
 * @
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDAO userDAO;
    
    @Override
    public User queryUserById(int userId) {
        
        return userDAO.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectUsers() {
        return userDAO.selectUsers();
    }
}
