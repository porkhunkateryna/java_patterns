package t32;

public class Tops extends AbstractDecorator{
    public Tops(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Tops";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.2f;
    }
}