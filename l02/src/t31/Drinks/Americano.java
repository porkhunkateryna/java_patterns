package t31.Drinks;
import t31.Ingredients.Ingredient;

public class Americano extends Drink{
    public Americano(double sugar) {
        this.ingredients.put(Ingredient.COFFEE,0.007);
        this.ingredients.put(Ingredient.WATER,0.12);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 19;
    }
}
