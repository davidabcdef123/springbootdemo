package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Super on 2017/3/7.
 */
@RestController
public class HomeController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/")
    @Cacheable(value="test")
    public String getSessionId(HttpSession session){
        redisUtil.set("123", "测试");
        System.out.println("进入了方法");
        String string= redisUtil.get("123").toString();
        return string;
    }

}
