import processor.IntelProcessor;
import processor.Processor;
import ram.DDR3Ram;
import ram.Ram;

public class User {
    public static void main(String[] args) {
        Processor processor = new IntelProcessor();
        Ram ram  = new DDR3Ram();
        Laptop laptop =  new Laptop(processor, ram);
        laptop.start();
    }
}
