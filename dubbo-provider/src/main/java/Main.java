import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
