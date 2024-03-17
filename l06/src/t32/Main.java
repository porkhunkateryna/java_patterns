package t32;
import t32.Builders.CarBuilder;
public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        director.setBuilder(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car sedan = director.buildSedan("black", "summer");
        System.out.println(sedan);
    }
}
