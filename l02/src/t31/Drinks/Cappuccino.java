package t31.Drinks;
import t31.Ingredients.Ingredient;
public class Cappuccino extends Drink{
    public Cappuccino(double sugar) {
        this.ingredients.put(Ingredient.COFFEE,0.014);
        this.ingredients.put(Ingredient.WATER,0.1);
        this.ingredients.put(Ingredient.MILK, 0.1);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 26;
    }
}