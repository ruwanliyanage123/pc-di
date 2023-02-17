import com.google.inject.Inject;

public class Laptop {
    @Inject
    private Processor intelProcessor;
    @Inject
    private Ram ddr3Ram;

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
