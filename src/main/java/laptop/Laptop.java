package laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

@Component
public class Laptop {

    @Autowired
    @IntelProcessor
    private Processor intelProcessor;
    @Autowired
    @DDR3Ram
    private Ram ddr3Ram;

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
