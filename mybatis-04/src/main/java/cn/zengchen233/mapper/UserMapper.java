package cn.zengchen233.mapper;

import cn.zengchen233.pojo.User;

import java.util.List;
import java.util.Map;

/**
* @author 曾晨
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-06 12:16:55
* @Entity cn.zengchen233.pojo.User
*/
public interface UserMapper {
    User getById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);
}
