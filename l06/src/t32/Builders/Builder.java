package t32.Builders;
import t32.Car;
import t32.CarParts.*;
public interface Builder {
    Builder setBodyType(String bodyType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setWheels(Wheel wheels);
    Builder setColor(String color);
    Builder setTires(String tires);
    Car build();
}
