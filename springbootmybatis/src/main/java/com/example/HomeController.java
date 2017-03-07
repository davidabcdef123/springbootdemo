package com.example;

import com.example.mapper.DictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Super on 2017/3/7.
 */
@RestController
public class HomeController {

    @Autowired
    DictDao dictDao;

    @RequestMapping("/")
    public String home(){
        List result=dictDao.findTypeList(null);
        System.out.println(result);
        return "success";
    }
}
