package laptop;

import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

@Component
public class Laptop {

    private final Processor intelProcessor;
    private final Ram ddr3Ram;

    public Laptop(@AMDProcessor Processor intelProcessor, @DDR4Ram Ram ddr3Ram) {
        this.intelProcessor = intelProcessor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
