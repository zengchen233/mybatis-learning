package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;

/**
 * @title: UserDao
 * @author: zengchen
 * @description:
 * @create: 2023/2/4 10:47
 */
public interface UserMapper {
    List<User> getUserList();
}
