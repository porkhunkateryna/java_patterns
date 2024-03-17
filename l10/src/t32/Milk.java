package t32;

public class Milk extends AbstractDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Milk";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.15f;
    }
}
