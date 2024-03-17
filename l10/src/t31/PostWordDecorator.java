package t31;

public class PostWordDecorator extends AbstractDecorator{
    private final String word;
    public PostWordDecorator(Outputer outputer, String word) {
        super(outputer);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
