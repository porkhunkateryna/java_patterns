package t31.Drinks;
import t31.Ingredients.Ingredient;
import java.util.HashMap;
import java.util.Map;

public class Espresso extends Drink{

    public Espresso(double sugar) {
        this.ingredients.put(Ingredient.COFFEE,0.007);
        this.ingredients.put(Ingredient.WATER,0.03);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 19;
    }


    @Override
    public double getPrimePrice() {
        double price = 0;
        for (Map.Entry<Ingredient, Double> entry: ingredients.entrySet()){
            price += entry.getKey().getPrice()*entry.getValue();
        }
        return price;
    }
}