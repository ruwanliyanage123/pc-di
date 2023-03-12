package laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import processor.Processor;
import ram.Ram;

@Component
public class Laptop {
    @Autowired
    private Ram ram;
    @Autowired
    public Processor processor;

    @Autowired
    public void displayRamReport(){
        System.out.println("----RAM------");
        System.out.println("storage:"+this.ram.getStorage());
        System.out.println("brand  :"+this.ram.getBrand());
        System.out.println("speed  :"+this.ram.getClockSpeed());
    }
    @Autowired
    public void displayProcessorReport(){
        System.out.println("----Processor------");
        System.out.println("storage:"+this.processor.getBrand());
        System.out.println("brand  :"+this.processor.getCoreCount());
        System.out.println("speed  :"+this.processor.getClockSpeed());
    }
}
