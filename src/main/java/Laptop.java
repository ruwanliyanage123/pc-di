import com.google.inject.Inject;

import javax.inject.Named;

public class Laptop {
    private Processor intelProcessor;

    private Ram ddr3Ram;

    @Inject
    public Laptop(@Named("amd") Processor processor, Ram ddr3Ram){
        this.intelProcessor = processor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
