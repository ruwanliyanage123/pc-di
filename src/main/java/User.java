import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import processor.Processor;
import ram.Ram;

public class User {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Processor processor = context.getBean(Processor.class);
        Ram ram = context.getBean(Ram.class);
        Laptop laptop = new Laptop(processor, ram);
        laptop.start();

        context.close();
    }
}
