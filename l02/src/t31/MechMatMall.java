package t31;
import t31.Drinks.Drink;
import t31.Tools.*;
import java.util.ArrayList;
import java.util.Random;

public class MechMatMall {
    private double revenue;
    private double expended;
    private double netProfit;
    private ArrayList<Drink> selledDrinks;

    private CoffeeMachine coffeeMachine;
    private Kettle kettle;
    public MechMatMall() {
        this.revenue = 0;
        this.expended = 0;
        this.netProfit = 0;
        this.selledDrinks = new ArrayList<>();
        coffeeMachine = new CoffeeMachine();
        kettle = new Kettle();
    }

    public double randomSugar(){
        return (int)(Math.random() * 4);
    }
    public void session(int orderQuantity){
        for(int i = 0 ; i<orderQuantity;i++){
            Random random = new Random();
            if(random.nextBoolean()){
                if(random.nextBoolean()){
                    selledDrinks.add(kettle.makeDrink(KettleDrinks.FILTERCOFFE,randomSugar()));
                }else {
                    selledDrinks.add(kettle.makeDrink(KettleDrinks.TEA,randomSugar()));
                }
            }else {
                int type = (int)(Math.random() * 4);
                if(type==0){
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.AMERICANO,randomSugar()));
                } else if (type==1) {
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.ESPRESSO,randomSugar()));
                }else if (type==2) {
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.LATTE,randomSugar()));
                }else{
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.CAPPUCCINO,randomSugar()));
                }
            }
        }

    }

    public void output(){
        System.out.println("\n\n\n");

        for(Drink drink:selledDrinks){
            revenue+=drink.getSellingPrice();
            expended+=drink.getPrimePrice();
        }
        netProfit = revenue-expended;
        System.out.println("Total revenue of session: "+ revenue);
        System.out.println("Total expended of session: "+expended);
        System.out.println("Net profit of session: " + netProfit);
    }
}
