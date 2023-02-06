package cn.zengchen233.mapper;

import cn.zengchen233.pojo.User;

/**
* @author 曾晨
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-06 10:17:09
* @Entity cn.zengchen233.pojo.User
*/
public interface UserMapper {
    User getByIdUser(int id);
}
