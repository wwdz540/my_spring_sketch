package cn.zhipingok.sketch.controller;

import cn.zhipingok.sketch.dao.iml.SvsInstanceDaoIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {


    @Autowired
    SvsInstanceDaoIml instanceDao;

    @RequestMapping(value = {"/hello"})
    public String say(){

        instanceDao.find();
        //res.save(new SvsInstance());
        return "hello";
    }
}
