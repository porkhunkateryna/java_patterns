package t22;

public class Multiply implements Strategy{
    @Override
    public void calculate(double a, double b) {
        System.out.println("a * b = " + (a * b));
    }
}
