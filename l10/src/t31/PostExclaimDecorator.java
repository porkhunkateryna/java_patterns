package t31;

public class PostExclaimDecorator extends AbstractDecorator{
    public PostExclaimDecorator(Outputer outputer) {
        super(outputer);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
