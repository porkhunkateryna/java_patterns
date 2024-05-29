package t21;

public interface Employee {

    int getSalary();

    void accept(Visitor visitor);
}
