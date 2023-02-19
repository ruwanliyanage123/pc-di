package laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

import javax.annotation.Resource;

@Component
public class Laptop {
    @Autowired
    @Qualifier("processor.IntelProcessor")
    private Processor intelProcessor;
    @Autowired
    @Qualifier("ram.DDR3Ram")
    private Ram ddr3Ram;

    public void start(){
        System.out.println("Laptop properties: processor-"+intelProcessor +"and ram-"+ddr3Ram);
    }
}
