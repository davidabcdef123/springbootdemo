package test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Super on 2017/3/6.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    protected static Logger logger = LoggerFactory.getLogger(Example.class);

    @RequestMapping("/")
    String home() {
        logger.debug("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@jin ru l home");
        return "Hello World!";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }
}
