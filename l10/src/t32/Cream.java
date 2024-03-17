package t32;

public class Cream extends AbstractDecorator{
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Cream";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.1f;
    }
}