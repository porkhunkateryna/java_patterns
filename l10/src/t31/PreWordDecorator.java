package t31;

public class PreWordDecorator extends AbstractDecorator{
    private final String word;
    public PreWordDecorator(Outputer outputer, String word) {
        super(outputer);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}