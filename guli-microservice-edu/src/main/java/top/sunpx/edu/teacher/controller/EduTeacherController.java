package top.sunpx.edu.teacher.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.sunpx.edu.teacher.service.EduTeacherService;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author sunpx
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/teacher/teacher")
public class EduTeacherController {

    @Autowired
    EduTeacherService eduTeacherService;

    @GetMapping("/all")
    public Object s(){
        return eduTeacherService.list(null);
    }
}

