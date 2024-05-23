package t23;


public class Client {


    public static void main(String[] args) {
        final ConcreteOriginator originator = new ConcreteOriginator();
        final ConcreteOriginator originator2 = new ConcreteOriginator();

        final Caretaker caretaker = new Caretaker();

        originator.updateState("Hello");
        caretaker.push(originator.save());

        originator2.updateState("Mech");
        caretaker.push(originator2.save());

        originator.updateState(", ");
        caretaker.push(originator.save());

        originator2.updateState("-");
        caretaker.push(originator2.save());

        originator.updateState("World");
        caretaker.push(originator.save());

        originator2.updateState("Math");
        caretaker.push(originator2.save());

        originator.updateState("!");
        caretaker.push(originator.save());

        originator2.updateState("forever");
        caretaker.push(originator2.save());

        originator.printState();
        originator2.printState();


        // TODO: perform undo
        caretaker.undo();
        caretaker.undo();
        caretaker.undo();
        caretaker.undo();
        originator.printState();
        caretaker.undo();

        originator2.printState();

//        // TODO: perform undo
//        caretaker.undo();
//
//        originator.printState();
//        originator2.printState();
//
//        // TODO: perform undo
//        caretaker.undo();
//
//        originator.printState();
//        originator2.printState();
//
//        // TODO: perform undo
//        caretaker.undo();
//
//        originator.printState();
//        originator2.printState();
//
//        // TODO: perform undo
//        caretaker.undo();
//
//        originator.printState();
//        originator2.printState();
//
//    }
    }
}
