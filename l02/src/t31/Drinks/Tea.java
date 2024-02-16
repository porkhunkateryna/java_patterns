package t31.Drinks;
import t31.Ingredients.Ingredient;

public class Tea extends Drink{
    public Tea(double sugar) {
        this.ingredients.put(Ingredient.TEABAG,1.0);
        this.ingredients.put(Ingredient.WATER,0.25);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 15;
    }
}