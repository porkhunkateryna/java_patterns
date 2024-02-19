package t22.Factories;
import t22.Transport.*;
public class VolvoFactory implements TransportFactory{
    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new VolvoBus();
    }

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }
}