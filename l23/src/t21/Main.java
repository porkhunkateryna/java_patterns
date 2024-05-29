package t21;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ITSupport(45000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new SalaryIncreaseVisitor(10));
        System.out.println("Total amount paid to staff after 10% increase: " + staffList.getSalary());

        staffList.accept(new PenaltyVisitor(1000));
        System.out.println("Total amount paid to staff after 1000 penalty: " + staffList.getSalary());
    }
}