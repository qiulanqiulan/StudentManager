package com.pandawork.service.impl;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qiulan on 2016/3/31.
 */
@Service("studentService")
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentMapper studentmapper;
    @Override
    public Student queryById(int id) throws SSException{

        if(Assert.lessOrEqualZero(id)){  //id为0或者为负数
            return null;
        }
          try{
             return studentmapper.queryById( id);
            }catch (Exception e){
                e.printStackTrace();
                 return null;
            }

        }

    @Override
    public void update(Student student) throws SSException {
        if(Assert.isNotNull(student)){
            return ;
        }
        try{
            studentmapper.update(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Student student) throws SSException {
        if(Assert.isNotNull(student)){
            return ;
        }
        try{
            studentmapper.delete(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Student> listAll() throws  SSException{

        try {
          return studentmapper.listAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
