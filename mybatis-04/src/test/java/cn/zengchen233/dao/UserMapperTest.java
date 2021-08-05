package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test() {
        //第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // logger.info(sqlSession);

        // 执行Sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void log4j() {
        logger.info("info:进入log4j");
        logger.debug("debug:进入了log4j");
        logger.error("error:进入了log4j");
    }

    @Test
    public void Limit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Integer> map = new HashMap<>();

        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userByLimit = mapper.getUserByLimit(map);

        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void RowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(2, 3);

        //通过Java代码层面实现分页
        List<User> userList = sqlSession.selectList("cn.zengchen233.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
