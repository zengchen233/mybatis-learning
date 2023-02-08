package cn.zengchen233.mapper;

import cn.zengchen233.pojo.Student;

import java.util.List;

/**
* @author 曾晨
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-02-08 09:44:34
* @Entity cn.zengchen233.pojo.Student
*/
public interface StudentMapper {
    List<Student> getStudent();

    List<Student> getStudent2();
}




