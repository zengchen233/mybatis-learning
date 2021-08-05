package cn.zengchen233.dao;

import cn.zengchen233.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生信息,以及对应老师的信息
    public List<Student> getStudentInfo();

    public List<Student> getStudent();

}
