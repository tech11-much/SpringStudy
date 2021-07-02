import com.yang.service.UserService;
import com.yang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //注意代理的是接口，而不是具体的类,JDK的实现方式，如果想要代理类，需要使用cglib的方式，需要设置代理模式为<aop:aspectj-autoproxy proxy-target-class="true"/>，默认是false，jdk实现
        UserServiceImpl service = (UserServiceImpl) context.getBean("userService");
        service.add();
    }
}
