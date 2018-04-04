package com.chenquan.util;

import com.chenquan.dao.Result;

/**
 * @author 陈泉
 * @Date 2018/4/4 0004下午 4:27
 * @
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
