package t22;

import java.util.Stack;

public class Caretaker {
    private final Originator originator;

    private final Stack<Memento> history=new Stack<>();
    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void updateState(String toUpdate){
        Memento memento=originator.save();
        history.push(memento);

        originator.updateState(toUpdate);
    }

    public void undo(){
        if (history.empty()){
            return;
        }
        Memento memento=history.pop();
        originator.restore(memento);
    }

    public void printState() {
        originator.printState();
    }
}
