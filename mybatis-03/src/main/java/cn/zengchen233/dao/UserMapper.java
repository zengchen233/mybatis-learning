package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
}
