package com.pandawork.service;

import com.pandawork.common.entity.Student;

import java.util.List;

/**
 * Created by qiulan on 2016/3/31.
 */
public interface StudentService {
    /**
     * 根据id查学生
     */
    public Student queryById(int id)throws Exception;
    /**
     * 更新
     */
    public void update(Student student)throws Exception;
    /**
     * 删除
     */
    public void delete(Student student)throws Exception;
    /**
     * 获取学生列表
     */
    public List<Student> listAll() throws Exception;


}
