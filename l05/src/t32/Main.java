package t32;
import t32.Builders.CarBuilder;
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car jeepClone = jeep.clone();
        System.out.println(jeepClone);
    }
}
