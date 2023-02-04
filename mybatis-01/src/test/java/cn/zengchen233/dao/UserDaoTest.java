package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @title: UserDaoTest
 * @author: zengchen
 * @description:
 * @create: 2023/2/4 10:57
 */
public class UserDaoTest {
    @Test
    public void test() {
        //获取SqlSession对象
        SqlSession session = MybatisUtils.getSqlSession();

        //方式一：getMapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }
}
