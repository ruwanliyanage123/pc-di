package processor;

public class AMDProcessor implements Processor {
    public AMDProcessor(){
        System.out.println("AMD Processor connected...");
    }

    public void running() {
        System.out.println("AMD Processor running...");
    }
}
