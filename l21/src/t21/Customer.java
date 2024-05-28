package t21;

public class Customer {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount){
        strategy.makePayment(amount);
    }

}
