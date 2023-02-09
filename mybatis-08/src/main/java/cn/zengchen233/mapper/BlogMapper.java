package cn.zengchen233.mapper;

import cn.zengchen233.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
* @author 曾晨
* @description 针对表【blog】的数据库操作Mapper
* @createDate 2023-02-09 11:20:53
* @Entity cn.zengchen233.pojo.Blog
*/
public interface BlogMapper {
    int addBook(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}




