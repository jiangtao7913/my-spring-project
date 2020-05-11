import com.jt.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author jt
 * @Date 2020/5/11/0011
 **/
@RunWith(SpringRunner.class)
@SpringJUnitConfig(locations = {"classpath*:application.xml","classpath*:spring-datasource.xml"})
public class Test {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void test(){
        userService.findUserById();
    }
}
