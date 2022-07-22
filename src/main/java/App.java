import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage()+" "+bean2.getMessage());
        Cat catbean1 =
                (Cat) applicationContext.getBean("cat");
        Cat catbean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("cats "+catbean1.equals(catbean2));
        System.out.println("HW "+bean1.equals(bean2));

    }
}