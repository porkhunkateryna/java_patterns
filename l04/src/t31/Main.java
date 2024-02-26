package t31;
import t31.Builders.CarBuilder;
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car sedan = director.buildSedan("black", "summer");
        System.out.println(sedan);
    }
}