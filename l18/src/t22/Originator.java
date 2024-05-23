package t22;

public class Originator  {
    /**
     * Цей параметр моделює стан нашого об'єкту
     */
    private String state = "";

   //    Технічні методи встановлення та друкування стану

    /**
     * Виводить стан об'єкту в консоль
     */
    public void printState() {
        System.out.println(state);
    }

    /**
     * Оновлює стан конкатенуючи до поточного стану заданий рядок
     * @param toUpdate параметр, що додається до об'єкту
     */
    public void updateState(String toUpdate) {
        this.state += toUpdate;
    }

    public Memento save(){
        return new ConcreteMemento(state);
    }

    public void restore(Memento memento){
        if(memento instanceof  ConcreteMemento){
            state=((ConcreteMemento)memento).getState();
        }
    }

}
