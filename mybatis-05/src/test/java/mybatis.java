import cn.zengchen233.mapper.UserMapper;
import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author zengchen
 * @title mybatis
 * @description
 * @create 2023/2/7
 */
public class mybatis {

    static SqlSession session = MybatisUtils.getSqlSession();

    static UserMapper mapper = session.getMapper(UserMapper.class);

    @Test
    public void getByName() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getByName("zengchen");
        System.out.println(user);
        session.close();
    }

    @Test
    public void getUser() {
        List<User> userList = mapper.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserById() {
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void addUser() {
        mapper.addUser(new User(7, "zcc", "123123"));
        session.close();
    }

    @Test
    public void updateUser() {
        mapper.updateUser(new User(1, "zc", "123123"));
        session.close();
    }
}
