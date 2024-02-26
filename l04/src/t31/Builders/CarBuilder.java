package t31.Builders;
import t31.CarParts.*;
import t31.Car;
public class CarBuilder implements Builder{
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    private String tires;
    @Override
    public Builder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheels(Wheel wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder setTires(String tires) {
        this.tires = tires;
        return this;
    }

    @Override
    public Car build() {
        return new Car(bodyType,engine,transmission,wheels,color,tires);
    }
}