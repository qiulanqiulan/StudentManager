package com.pandawork.web.controller;

import com.pandawork.common.entity.Student;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiulan on 2016/4/6.
 */
@Controller
@RequestMapping(value = "/Student")
public class ShowMessageController extends AbstractController {
    @RequestMapping(value="/list")
    public String ShowMessage(Model model){
        List<Student> list = null;
        try {
            list = studentService.listAll();
            model.addAttribute("list",list);
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    return "ShowMessage";
    }

}
