import com.yang.dao.UserMapper;
import com.yang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper2 = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper2.selectUser()) {
            System.out.println(user);
        }
    }
}
