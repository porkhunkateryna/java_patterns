package t22;

public class Client {


    public static void main(String[] args) {
        final Originator originator = new Originator();
        final Caretaker caretaker=new Caretaker(originator);

        caretaker.updateState("Hello");
        caretaker.updateState(", ");
        caretaker.updateState("World");
        caretaker.updateState("!");
        caretaker.printState();

        // TODO: perform undo
        caretaker.undo();
        caretaker.printState();

        // TODO: perform undo
        caretaker.undo();

        caretaker.printState();

        // TODO: perform undo
        caretaker.undo();

        caretaker.printState();

        // TODO: perform undo
        caretaker.undo();

        caretaker.printState();

        // TODO: perform undo
        caretaker.undo();

        caretaker.printState();

    }

}
