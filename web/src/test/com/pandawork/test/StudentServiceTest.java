package com.pandawork.test;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiulan on 2016/4/3.
 */
public class StudentServiceTest extends AbstractTestCase{
    @Autowired
    StudentService studentService;

    @Test
    public void testListALL() throws Exception{
        List<Student> list = studentService.listAll();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
