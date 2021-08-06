package cn.zengchen233.dao;

import cn.zengchen233.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取老师
    // List<Teacher> getTeacher();

    //获取指定老师下的所有学生以及老师的信息
    Teacher getTeacher(@Param("id") int id);

    // 子查询
    Teacher getTeacher2(@Param("id") int id);
}
