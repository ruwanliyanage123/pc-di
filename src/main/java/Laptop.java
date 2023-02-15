public class Laptop {
    private IntelProcessor intelProcessor;
    private DDR3Ram ddr3Ram;

    public Laptop(){
        //tightly coupled with the dependencies
        intelProcessor = new IntelProcessor();
        ddr3Ram = new DDR3Ram();
    }

    public void start(){
        System.out.println("Laptop is starting...");
    }
}
