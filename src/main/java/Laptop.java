import javax.inject.Inject;
import javax.inject.Named;

public class Laptop {
    @Inject
    @Named("amd")
    private Processor intelProcessor;

    @Inject
    private Ram ddr3Ram;

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
