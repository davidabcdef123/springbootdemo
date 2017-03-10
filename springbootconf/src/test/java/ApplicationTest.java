import com.Application;
import com.service.BlogProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Blob;

/**
 * Created by Super on 2017/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    @Autowired
    BlogProperties blogProperties;

    @Test
    public void getHello(){
        System.out.println(blogProperties.getName());
        System.out.println(blogProperties.getDesc());
        System.out.println(blogProperties.getNumber());

    }
}
