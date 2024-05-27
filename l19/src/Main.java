//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/input.txt");
        LargestLineObserver largestLineObserver = new LargestLineObserver();
        LargestWordObserver largestWordObserver = new LargestWordObserver();
        CounterObserver counterObserver = new CounterObserver();
        LineWithWordObserver lineWithWordObserver = new LineWithWordObserver();

        fileReader.addObserver(largestLineObserver);
        fileReader.addObserver(largestWordObserver);
        fileReader.addObserver(counterObserver);
        fileReader.addObserver(lineWithWordObserver);

        fileReader.read();


        System.out.println("Largest word: " + largestWordObserver.getWord());
        System.out.println("Largest line: " + largestLineObserver.getLargestLine());
        System.out.println("Line with largest word: " + lineWithWordObserver.getLineWithWord());
        System.out.println("Amount of words: " + counterObserver.getCounter());
    }

}