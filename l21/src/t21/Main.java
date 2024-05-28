package t21;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setStrategy(new ApplePay());
        customer.pay(100);

        customer.setStrategy(new BankAccount());
        customer.pay(200);

        customer.setStrategy(new PayPal());
        customer.pay(300);
    }
}