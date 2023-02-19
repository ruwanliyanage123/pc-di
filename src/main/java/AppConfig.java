import laptop.AMDProcessor;
import laptop.DDR3Ram;
import laptop.DDR4Ram;
import laptop.IntelProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import processor.Processor;
import ram.Ram;

@Configuration
@ComponentScan(basePackages = { "processor", "ram", "laptop" })
public class AppConfig {

    @Bean
    @IntelProcessor
    public Processor intelProcessor() {
        return new processor.IntelProcessor();
    }

    @Bean
    @DDR3Ram
    public Ram ddr3Ram() {
        return new ram.DDR3Ram();
    }

    @Bean
    @AMDProcessor
    public Processor amdProcessor() {
        return new processor.AMDProcessor();
    }

    @Bean
    @DDR4Ram
    public Ram ddr4Ram() {
        return new ram.DDR4Ram();
    }
}