package com.zhang.user;

/**
 * 类描述：
 * 创建时间：2020/6/20 11:11 下午
 * 创建人：zhang
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getNameById(String userId) {
        System.out.println("receive request data:" + userId);
        return "zhang";
    }
}
