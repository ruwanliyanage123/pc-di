package laptop;

import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

@Component
public class Laptop {
    private Processor intelProcessor;
    private Ram ddr3Ram;

    public Laptop(Processor intelProcessor, Ram ddr3Ram) {
        this.intelProcessor = intelProcessor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
