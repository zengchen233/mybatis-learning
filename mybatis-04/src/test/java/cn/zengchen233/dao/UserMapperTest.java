package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


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
}
