package t32;
import java.util.Scanner;
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void work(){
        while (true) {
            System.out.println("HI I`m director. What u want to build? \n" +
                    "Enter 1 to append new string;\n" +
                    "Enter 2 to insert string\n" +
                    "Enter 3 to see current string\n" +
                    "Enter 0  to exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter string to append: ");
                    builder.appendString(sc.next());
                }case 2 -> {
                    System.out.println("Enter index of insertion:");
                    int index = sc.nextInt();
                    System.out.println("Enter string to insert:");
                    builder.insertString(index,sc.next());
                }case 3 -> {
                    System.out.println(builder.getStr());
                }
                case 0 ->{
                    System.out.println("Bye!");
                    return;
                }default -> System.out.println("Incorrect input!");
            }
        }
    }


}
