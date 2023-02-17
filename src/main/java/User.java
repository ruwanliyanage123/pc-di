import com.google.inject.Guice;
import com.google.inject.Injector;

public class User {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LaptopModule());
        Laptop laptop =  injector.getInstance(Laptop.class);
        laptop.start();
    }
}
