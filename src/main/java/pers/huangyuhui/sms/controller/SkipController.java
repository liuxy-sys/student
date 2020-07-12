package pers.huangyuhui.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @ClassName SkipController
 * @Description TODO
 * @Author lxy
 * @Date 2020/7/9
 * @Since 1.8
 * @Version 1.0
 */
@Controller
public class SkipController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "common/welcome";
    }
    @GetMapping("/settings")
    public String settings() {
        return "common/settings";
    }
    @GetMapping("/studentList")
    public String studentList() {
        return "student/studentList";
    }
    @GetMapping("/teacherList")
    public String teacherList() {
        return "teacher/teacherList";
    }
    @GetMapping("/clazzList")
    public String clazzList() {
        return "clazz/clazzList";
    }
    @GetMapping("/gradeList")
    public String gradeList() {
        return "grade/gradeList";
    }
    @GetMapping("/adminList")
    public String adminList() {
        return "admin/adminList";
    }
}
