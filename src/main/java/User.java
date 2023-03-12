import laptop.Laptop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Settings.class).getBean(Laptop.class);
    }
}
