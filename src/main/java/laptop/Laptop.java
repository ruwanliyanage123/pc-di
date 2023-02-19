package laptop;

import processor.Processor;
import ram.Ram;

public class Laptop {

    private final Processor processor;
    private final Ram ram;

    public Laptop(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public void start(){
        System.out.println("Laptop properties: processor-"+processor +"and ram-"+ram);
    }
}
