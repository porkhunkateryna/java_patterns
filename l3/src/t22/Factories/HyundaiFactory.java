package t22.Factories;
import t22.Transport.*;
public class HyundaiFactory implements TransportFactory{
    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }
}