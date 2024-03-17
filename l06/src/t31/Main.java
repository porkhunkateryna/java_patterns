package t31;
import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws IOException {
        String filename = "C://Users//katyu//IdeaProjects//l06//src//t31//input.txt";
        FileReader fileReader = FileReader.getInstance();
        fileReader.printFile(filename);
        System.out.println("\n\n\n\n");
        fileReader.countWords(filename);
    }
}