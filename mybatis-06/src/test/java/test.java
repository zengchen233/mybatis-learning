import cn.zengchen233.dao.StudentMapper;
import cn.zengchen233.dao.TeacherMapper;
import cn.zengchen233.pojo.Student;
import cn.zengchen233.pojo.Teacher;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentInfo = mapper.getStudentInfo();

        for (Student student : studentInfo) {
            System.out.println(student);
        }
    }

    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentInfo = mapper.getStudent();

        for (Student student : studentInfo) {
            System.out.println(student);
        }
    }
}
