package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author zengchen
 * @title UserMapper
 * @description
 * @create 2023/2/5
 */
public interface UserMapper {
    List<User> getUserList(String name);
}
