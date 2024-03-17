package t31;

public class PostComaDecorator extends AbstractDecorator{
    public PostComaDecorator(Outputer outputer) {
        super(outputer);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
