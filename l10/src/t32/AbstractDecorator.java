package t32;

abstract public class AbstractDecorator extends Beverage {

    final protected Beverage wrapper;

    public AbstractDecorator(Beverage beverage) {
        this.wrapper = beverage;
    }
}
