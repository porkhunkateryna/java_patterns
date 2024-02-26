package t32;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to start: ");
    StringBuilder builder = new StringBuilder(sc.next());
    Director director = new Director(builder);
    director.work();
}
}

