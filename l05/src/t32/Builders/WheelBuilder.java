package t32.Builders;
import t32.CarParts.Wheel;
public class WheelBuilder {
    private int diameter;
    private String material;

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public WheelBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Wheel build(){
        return new Wheel(diameter,material);
    }
}
