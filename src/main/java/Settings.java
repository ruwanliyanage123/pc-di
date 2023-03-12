import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import processor.Processor;
import ram.Ram;

@Configuration
@ComponentScan(basePackages = {"laptop", "ram", "processor"})
public class Settings{
    @Bean
    public Processor processor(){
        return new Processor("Intel", 4,"2.5GHz");
    }

    @Bean
    public Ram ram(){
        return new Ram("16GB","Kingston", "2.5GHz");
    }
}
