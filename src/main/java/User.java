import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

public class User {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LaptopModule());
        Laptop laptop =  injector.getInstance(Key.get(Laptop.class));
        laptop.start();
    }
}
