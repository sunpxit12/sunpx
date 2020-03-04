package top.sunpx.edu.teacher.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sunpx.common.exception.GuliException;
import top.sunpx.common.result.ResultCodeEnum;
import top.sunpx.common.result.ResultData;
import top.sunpx.edu.teacher.model.EduTeacher;
import top.sunpx.edu.teacher.service.EduTeacherService;

import java.util.List;

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
    public ResultData s(){
        int a=3/0;
        List<EduTeacher> list = eduTeacherService.list(null);
        if (list.size()>0){
            throw new GuliException(ResultCodeEnum.ADD_ERROR);
        }
        return ResultData.getError();
    }
}

