package cn.zengchen233.mapper;

import cn.zengchen233.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @author 曾晨
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-07 09:52:15
* @Entity cn.zengchen233.pojo.User
*/
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User getByName(String name);

    @Select("select * from user")
    List<User> getUser();
    /**
     * @description TODO 如果方法中存在多个参数，所有的参数前面必须加上@Param注解
     * @param uid
     * @return cn.zengchen233.pojo.User
     */
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int uid);

    @Insert("insert into user values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name = #{name}, pwd = #{pwd} where id = #{id}")
    int updateUser(User user);
}
