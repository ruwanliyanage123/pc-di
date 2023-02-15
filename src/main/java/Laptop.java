public class Laptop {
    private IntelProcessor intelProcessor;
    private DDR3Ram ddr3Ram;

    public Laptop(IntelProcessor intelProcessor, DDR3Ram ddr3Ram){
        this.intelProcessor = intelProcessor;
        this.ddr3Ram = ddr3Ram;
    }

    public void start(){
        System.out.println("Laptop is starting...");
    }
}
