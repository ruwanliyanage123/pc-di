# pc-di
Programming Concepts - Dependency Injection 

There are three version releases
- v1.0.0: Dependency Injection using Google Guice
- v2.0.0: Dependency Injection using spring annotations
- v3.0.0: Dependency Injection using spring xml

For this example project taken a well nown Example.

There is a Laptop class and there are two dependencies 

<h2>Method Injection</h2><br>
Using method injection, we can invoke the methods automatically without invoking them. We can do it by using @Autowired annotation.

    @Autowired
    public void displayProcessorReport(){
        System.out.println("----Processor------");
        System.out.println("storage:"+this.processor.getBrand());
        System.out.println("brand  :"+this.processor.getCoreCount());
        System.out.println("speed  :"+this.processor.getClockSpeed());
    }
    
No need to invoke the method
    
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Settings.class).getBean(Laptop.class);
    }
    
But if there are many methods, we need to consider excecuting order as well. We can use following annotations to fix that

    @PostConstruct
    @DependsOn()
    
We can write the Laptop.java class as follows.     

    @Component
    public class Laptop {
        @Autowired
        private Ram ram;
        @Autowired
        public Processor processor;

        @Autowired
        @PostConstruct
        @DependsOn({"ram"})
        public void displayRamReport(){
            System.out.println("----RAM------");
            System.out.println("storage:"+this.ram.getStorage());
            System.out.println("brand  :"+this.ram.getBrand());
            System.out.println("speed  :"+this.ram.getClockSpeed());
        }

        @Autowired
        @PostConstruct
        @DependsOn({"processor", "displayRamReport"})
        public void displayProcessorReport(){
            System.out.println("----Processor------");
            System.out.println("storage:"+this.processor.getBrand());
            System.out.println("brand  :"+this.processor.getCoreCount());
            System.out.println("speed  :"+this.processor.getClockSpeed());
        }
    }
