package t23;


import java.util.Stack;
public class Caretaker {


    private final Stack<Memento> history=new Stack<>();

    public void push(Memento memento){
        history.push(memento);
    }


    public void undo(){
        if (history.empty()){
            return;
        }
        Memento memento=history.pop();
        memento.restore();
    }


}
