import cn.zengchen233.mapper.StudentMapper;
import cn.zengchen233.mapper.TeacherMapper;
import cn.zengchen233.pojo.Teacher;
import cn.zengchen233.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author zengchen
 * @title mybatis_test
 * @description
 * @create 2023/2/9
 */
public class mybatis_test {
    static SqlSession session = MybatisUtils.getSqlSession();

    static TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);

    static StudentMapper studentMapper = session.getMapper(StudentMapper.class);

    @Test
    public void getTeacher() {
        List<Teacher> teacherList = teacherMapper.getTeacher();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        session.close();
    }

    @Test
    public void getTeacherAll() {
        Teacher teacher = teacherMapper.getTeacherAll(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void getTeacherAll2() {
        Teacher teacher = teacherMapper.getTeacherAll2(1);
        System.out.println(teacher);
        session.close();
    }
}
