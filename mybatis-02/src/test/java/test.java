import cn.zengchen233.dao.UserMapper;
import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author zengchen
 * @title test
 * @description
 * @create 2023/2/5
 */
public class test {
    @Test
    public void test1() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList("wm");
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }
}
