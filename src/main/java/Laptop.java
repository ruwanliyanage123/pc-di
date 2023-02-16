import javax.inject.Inject;

public class Laptop {
    private Processor intelProcessor;
    private Ram ddr3Ram;

    @Inject
    public Laptop(Processor intelProcessor, Ram ddr3Ram){
        this.intelProcessor = intelProcessor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop is starting...");
    }
}
