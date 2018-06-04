import com.dubbo.api.SayHiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        SayHiService sayHiService = (SayHiService) context.getBean("sayHiService");
        System.out.println("<-----------");
        sayHiService.sayHi("kinkin");
        System.out.println("------------->");
        System.in.read();
    }
}
