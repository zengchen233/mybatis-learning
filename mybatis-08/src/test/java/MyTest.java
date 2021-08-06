import cn.zengchen233.dao.BlogMapper;
import cn.zengchen233.pojo.Blog;
import cn.zengchen233.utils.IDUtils;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addBlogTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title", "Java");

        // map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title", "Java");

        // map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title", "Java");
        map.put("id", "e79a6eb37f62443eb0ce4ddecba1508f");
        map.put("author", "狂神说");
        mapper.updateBlog(map);



    }

    @Test
    public void foreach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        ArrayList ids = new ArrayList();

        ids.add(1);
        ids.add(2);

        map.put("ids", ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}

