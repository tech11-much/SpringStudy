import com.yang.config.MyConfig;
import com.yang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //通过配置类来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //根据配置类中方法名来取这个bean对象
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
