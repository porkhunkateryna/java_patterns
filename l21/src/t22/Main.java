package t22;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Subtract());
        calculator.calculate(10.2, 0.2);

        calculator.setStrategy(new Multiply());
        calculator.calculate(2.5, 4);

        calculator.setStrategy(new Add());
        calculator.calculate(3.1, 6.9);
    }
}
