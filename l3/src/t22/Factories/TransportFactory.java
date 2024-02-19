package t22.Factories;

import t22.Transport.Bus;
import t22.Transport.Tram;
import t22.Transport.Trolleybus;

public interface TransportFactory {
    Trolleybus createTrolleybus();
    Bus createBus();
    Tram createTram();
}
