package t31.Builders;
import t31.CarParts.*;
import t31.Car;
public interface Builder {

    Builder setBodyType(String bodyType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setWheels(Wheel wheels);
    Builder setColor(String color);
    Builder setTires(String tires);
    Car build();
}
