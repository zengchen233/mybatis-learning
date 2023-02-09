package cn.zengchen233.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName blog
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private String id;

    private String title;

    private String author;

    private Date createTime;

    private Integer views;
}