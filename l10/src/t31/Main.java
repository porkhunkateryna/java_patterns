package t31;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Outputer outputer;
        outputer = new InitDecorator();
        outputer = new PreWordDecorator(outputer,"hello");
        outputer = new PostComaDecorator(outputer);
        outputer = new PostSpaceDecorator(outputer);
        outputer = new PostWordDecorator(outputer,"world");
        outputer = new PostExclaimDecorator(outputer);
        outputer = new PostEndlDecorator(outputer);
        outputer.print();
    }
}