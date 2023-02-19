package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import processor.IntelProcessor;
import processor.Processor;
import ram.DDR3Ram;
import ram.Ram;

@Configuration
@ComponentScan(basePackages = { "processor", "ram", "laptop" })
public class AppConfig {

    @Bean(name = "processor.IntelProcessor")
    public Processor intelProcessor() {
        return new IntelProcessor();
    }

    @Bean(name = "ram.DDR3Ram")
    public Ram ddr3Ram() {
        return new DDR3Ram();
    }
}