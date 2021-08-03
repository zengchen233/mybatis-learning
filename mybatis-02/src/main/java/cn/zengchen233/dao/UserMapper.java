package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);
}
