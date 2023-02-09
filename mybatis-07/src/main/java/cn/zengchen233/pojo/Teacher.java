package cn.zengchen233.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName teacher
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
    private Integer id;

    private String name;

    //一个老师有很多个学生
    private List<Student> studentList;
}