package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
}
