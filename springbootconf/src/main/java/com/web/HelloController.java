package com.web;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * Created by Super on 2017/3/10.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){


        return "hello world";
    }

    public Future<String> hhh(){

        return new AsyncResult<>("任务一完成");
}

    public static void main(String[] args) {
        HelloController g=new HelloController();
        Future f=g.hhh();
        System.out.println(f.isDone());
    }
}
