import config.AppConfig;
import laptop.Laptop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop laptop = context.getBean(Laptop.class);
        laptop.start();
    }
}
