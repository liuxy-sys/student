package pers.huangyuhui.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.huangyuhui.sms.bean.Grade;
import pers.huangyuhui.sms.dao.GradeMapper;
import pers.huangyuhui.sms.service.GradeService;

import java.util.List;

/**
 * @ClassName GradeServiceImpl
 * @Description TODO
 * @Author lxy
 * @Date 2020/7/9
 * @Since 1.8
 * @Version 1.0
 */
@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    //注入Mapper接口对象
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> selectList(Grade gradename) {
        return gradeMapper.selectList(gradename);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    @Override
    public Grade findByName(String gradename) {
        return gradeMapper.findByName(gradename);
    }

    @Override
    public int insert(Grade grade) {
        return gradeMapper.insert(grade);
    }

    @Override
    public int update(Grade grade) {
        return gradeMapper.update(grade);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return gradeMapper.deleteById(ids);
    }
}