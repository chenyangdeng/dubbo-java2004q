import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.io.IOException;

public class Comsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        UserService service = (UserService)context.getBean("userService"); // 获取远程服务代理
        service.hello("comsumer"); // 执行远程方法
    }
}
