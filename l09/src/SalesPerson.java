public class SalesPerson extends Worker {

    private final Manager manager;
    public  SalesPerson(String name, String department, Manager manager) {
        super(name, department);
        this.manager = manager;
    }

}
