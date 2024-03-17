package t31;

public class PostEndlDecorator extends AbstractDecorator{

    public PostEndlDecorator(Outputer outputer) {
        super(outputer);
    }

    @Override
    public void print() {
        super.print();
        System.out.println();
    }
}
