package t22.Factories;
import t22.Transport.*;
public class SkodaFactory implements TransportFactory{
    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }
}