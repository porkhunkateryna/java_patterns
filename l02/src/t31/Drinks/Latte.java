package t31.Drinks;
import t31.Ingredients.Ingredient;
public class Latte extends Drink{
    public Latte(double sugar) {
        this.ingredients.put(Ingredient.COFFEE,0.009);
        this.ingredients.put(Ingredient.WATER,0.05);
        this.ingredients.put(Ingredient.MILK, 0.15);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 28;
    }
}