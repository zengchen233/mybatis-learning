import cn.zengchen233.mapper.BlogMapper;
import cn.zengchen233.pojo.Blog;
import cn.zengchen233.utils.IDUtils;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author zengchen
 * @title BolgTest
 * @description
 * @create 2023/2/9
 */
public class BolgTest {

    static SqlSession session = MybatisUtils.getSqlSession();

    static BlogMapper mapper = session.getMapper(BlogMapper.class);

    @Test
    public void addBook() {
        Blog blog = new Blog(IDUtils.getId(), "Spring", "zcc", new Date(), 1234);
        mapper.addBook(blog);
        session.close();
    }

    @Test
    public void queryBlogIF() {
        Map map = new HashMap();
        map.put("author", "zcc");
        map.put("title", "Spring");
        List<Blog> blogList = mapper.queryBlogIF(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void queryBlogChoose() {
        Map map = new HashMap();
        //map.put("views", 9999);
        map.put("title", "Spring");
        map.put("author", "zcc");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void updateBlog() {
        Map map = new HashMap<>();
        map.put("id", "309f2470dfff48f298478ff3ffa94fb4");
        map.put("title", "Mybatis");
        map.put("author", "zc");
        mapper.updateBlog(map);
        session.close();
    }

    @Test
    public void queryBlogForeach() {
        Map map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        map.put("list", list);
        List<Blog> blogList = mapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        session.close();
    }
}
