package t32;

public abstract class Beverage {
    public abstract String description();

    public abstract float cost();

    @Override
    public String toString() {
        return "Beverage: " + description() + ", $" + cost();
    }
}