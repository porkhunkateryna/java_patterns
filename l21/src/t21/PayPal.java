package t21;

public class PayPal implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }
}
