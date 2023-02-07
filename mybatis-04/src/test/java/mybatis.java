import cn.zengchen233.mapper.UserMapper;
import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zengchen
 * @title mybatis
 * @description
 * @create 2023/2/6
 */
public class mybatis {

    static Logger logger = Logger.getLogger(mybatis.class);

    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getById(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void Log4j() {
        logger.info("info:进入了Log4j方法");
        logger.debug("debug:进入了Log4j方法");
        logger.error("error:进入了Log4j方法");
    }

    @Test
    public void getUserByLimit() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }
}
