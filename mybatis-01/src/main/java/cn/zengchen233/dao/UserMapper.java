package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @title: UserDao
 * @author: zengchen
 * @description:
 * @create: 2023/2/4 10:47
 */
public interface UserMapper {
    /**
     * @description: 获取全部用户
     * @param
     * @return: java.util.List<cn.zengchen233.pojo.User>
     */
    List<User> getUserList();

    /**
     * @description: 插入一个用户
     * @param user
     * @return: int
     */
    int addUser(User user);

    /**
     * @description 修改用户
     * @param user
     * @return int
     */
    int updateUser(User user);

    /**
     * @description 删除用户
     * @param id
     * @return int
     */
    int delUser(int id);
}
