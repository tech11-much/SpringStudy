import com.yang.pojo.User;
import com.yang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //默认使用无参构造创建对象
        //UserT user = (UserT) context.getBean("u2");
        User user = (User) context.getBean("userT");
//        System.out.println(user == user1);
        user.show();
    }
}
