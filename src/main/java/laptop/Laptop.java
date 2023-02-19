package laptop;

import processor.Processor;
import ram.Ram;

public class Laptop {

    private final Processor intelProcessor;
    private final Ram ddr3Ram;

    public Laptop(Processor intelProcessor, Ram ddr3Ram) {
        this.intelProcessor = intelProcessor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
