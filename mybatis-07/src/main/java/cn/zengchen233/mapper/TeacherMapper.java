package cn.zengchen233.mapper;

import cn.zengchen233.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 曾晨
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-02-09 10:10:16
* @Entity cn.zengchen233.pojo.Teacher
*/
public interface TeacherMapper {
    /**
     * @description 获取老师
     * @param
     * @return java.util.List<cn.zengchen233.pojo.Teacher>
     */
    List<Teacher> getTeacher();

    Teacher getTeacherAll(@Param("tid") int id);

    Teacher getTeacherAll2(@Param("tid") int id);
}




