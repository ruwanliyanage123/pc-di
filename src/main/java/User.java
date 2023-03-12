import laptop.Laptop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
    public static void main(String[] args) {
        Laptop laptop = new AnnotationConfigApplicationContext(Settings.class).getBean(Laptop.class);
        laptop.displayProcessorReport();
        laptop.displayRamReport();
    }
}
