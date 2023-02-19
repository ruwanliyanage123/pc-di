package laptop;

import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

import javax.annotation.Resource;

@Component
public class Laptop {
    @Resource(name = "processor.IntelProcessor")
    private Processor intelProcessor;
    @Resource(name = "ram.DDR3Ram")
    private Ram ddr3Ram;

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
