package t32;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Sugar(espresso);
        espresso = new Sugar(espresso);
        System.out.println(espresso.description());
        System.out.println("Total cost=" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Tops(darkRoast);
        darkRoast = new Sugar(darkRoast);
        darkRoast = new Sugar(darkRoast);
        System.out.println(darkRoast.description());
        System.out.println("Total cost=" + darkRoast.cost());

        Beverage darkRoast2 = new DarkRoast();
        darkRoast2 = new Cream(darkRoast2);
        darkRoast2 = new Sugar(darkRoast2);
        System.out.println(darkRoast2.description());
        System.out.println("Total cost=" + darkRoast2.cost());

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Sugar(decaf);
        decaf = new Sugar(decaf);
        System.out.println(decaf.description());
        System.out.println("Total cost=" + decaf.cost());
    }
}
