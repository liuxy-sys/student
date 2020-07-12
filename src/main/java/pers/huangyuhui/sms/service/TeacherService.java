package pers.huangyuhui.sms.service;

import org.springframework.stereotype.Service;
import pers.huangyuhui.sms.bean.LoginForm;
import pers.huangyuhui.sms.bean.Teacher;

import java.util.List;

/**
 * @ClassName TeacherService
 * @Description TODO
 * @Author lxy
 * @Date 2020/7/9
 * @Since 1.8
 * @Version 1.0
 */
public interface TeacherService {

    // TODO: 6/18/2019 验证登录信息是否正确
    Teacher login(LoginForm loginForm);

    // TODO: 6/18/2019 根据教师与班级名查询指定/全部教师列表信息
    List<Teacher> selectList(Teacher teacher);

    // TODO: 6/19/2019 根据工号查询指定教师信息
    Teacher findByTno(Teacher teacher);

    // TODO: 6/18/2019 添加教师信息
    int insert(Teacher teacher);

    // TODO: 6/18/2019 根据id修改指定教师信息 
    int update(Teacher teacher);

    // TODO: 6/18/2019 根据id删除指定教师信息
    int deleteById(Integer[] ids);

    // TODO: 6/18/2019 根据id修改指定教师密码
    int updatePassowrd(Teacher teacher);

}
