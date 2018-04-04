package com.chenquan.dao;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 陈泉
 * @Date 2018/4/4 0004下午 4:19
 * @param:code 编码
 * @param:message 消息
 * @param:data 结果集
 */

@Getter
@Setter
public class Result {
    
    private int code;
    private String message;
    private Object data;

}



