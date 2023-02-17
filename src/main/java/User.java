import com.google.inject.Guice;
import com.google.inject.Injector;

public class User {
    public static void main(String[] args) {
        ((Laptop)getBean(Laptop.class)).start();
    }

    public static Object getBean(Class clas){
        Injector injector = Guice.createInjector(new LaptopModule());
        return injector.getInstance(clas);
    }
}
