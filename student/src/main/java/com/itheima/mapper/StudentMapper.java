package com.itheima.mapper;

import com.itheima.pojo.Student;

import java.util.List;

/**
 * @author nie
 * @create 2022-05-16-21:01
 */
public interface StudentMapper {
    public List<Student> findstudnetBynameAndmojor(Student student);
    public List<Student> findall(List<Integer> id);
}
