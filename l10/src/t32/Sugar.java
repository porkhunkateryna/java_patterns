package t32;

public class Sugar extends AbstractDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Sugar";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.05f;
    }
}
