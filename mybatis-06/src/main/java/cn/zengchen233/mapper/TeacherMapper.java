package cn.zengchen233.mapper;

import cn.zengchen233.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author 曾晨
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-02-08 09:45:25
* @Entity cn.zengchen233.pojo.Teacher
*/
public interface TeacherMapper {
    Teacher getTeacher(@Param("id") int id);
}




