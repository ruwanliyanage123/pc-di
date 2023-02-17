import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class LaptopModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
        bind(Processor.class).annotatedWith(Names.named("intel")).to(IntelProcessor.class);
        bind(Processor.class).annotatedWith(Names.named("amd")).to(AMDProcessor.class);
        bind(Ram.class).to(DDR3Ram.class);
    }
}
