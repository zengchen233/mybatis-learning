import cn.zengchen233.mapper.StudentMapper;
import cn.zengchen233.mapper.TeacherMapper;
import cn.zengchen233.pojo.Student;
import cn.zengchen233.pojo.Teacher;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author zengchen
 * @title mybatis
 * @description
 * @create 2023/2/8
 */
public class mybatis {

    static SqlSession session = MybatisUtils.getSqlSession();

    static TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);

    static StudentMapper studentMapper = session.getMapper(StudentMapper.class);
    @Test
    public void getTeacher() {
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void getStudent() {
        List<Student> students = studentMapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void getStudent2() {
        List<Student> students = studentMapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
}
