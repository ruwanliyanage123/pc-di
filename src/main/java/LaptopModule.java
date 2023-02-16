import com.google.inject.AbstractModule;

public class LaptopModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
        bind(Processor.class).to(IntelProcessor.class);
        bind(Ram.class).to(DDR3Ram.class);
    }
}
