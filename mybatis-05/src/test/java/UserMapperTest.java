import cn.zengchen233.dao.UserMapper;
import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // List<User> user = mapper.getUser();
        // for (User user1 : user) {
        //     System.out.println(user1);
        // }
        // User userById = mapper.getUserById(1);
        // System.out.println(userById);
        // mapper.addUser(new User(6, "hello", "123"));
        // mapper.updateUser(new User(6,"nihao","123123"));
        mapper.delUser(6);
        sqlSession.close();
    }
}
