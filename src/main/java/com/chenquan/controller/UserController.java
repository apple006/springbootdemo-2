package com.chenquan.controller;

import com.chenquan.dao.Result;
import com.chenquan.entity.User;
import com.chenquan.service.UserService;
import com.chenquan.util.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈泉
 * @Date 2018/4/4 0004上午 11:47
 * @
 */


@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Resource
    private UserService userService;

    /**
     * 根据编号查询人员
     * @param userId
     * @return Result
     */
    @GetMapping(value = "/queryUserById")
    public Result queryUserById(@RequestParam(value = "userId") int userId){
        User user = userService.queryUserById(userId);
        return ResultUtil.success(user);
    }

    /**
     * 查询所有的人员
     * @return Result
     */
    @GetMapping(value = "queryUsers")
    public Result queryUsers(){
        List<User> users = userService.selectUsers();
        return ResultUtil.success(users);
    }

     
}
