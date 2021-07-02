import com.yang.demo01.Host;
import com.yang.demo01.Proxy;

public class MyTest {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
