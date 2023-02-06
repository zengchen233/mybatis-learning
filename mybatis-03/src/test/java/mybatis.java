import cn.zengchen233.mapper.UserMapper;
import cn.zengchen233.pojo.User;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author zengchen
 * @title mybatis
 * @description
 * @create 2023/2/6
 */
public class mybatis {
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getByIdUser(1);
        System.out.println(user);
        session.close();
    }
}
