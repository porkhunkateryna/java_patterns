package t33;

public class ArithmeticSimulator {
    public static void main(String[] args) {
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler substractionHandler = new SubstractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();


        additionHandler.setNext(substractionHandler);
        substractionHandler.setNext(multiplicationHandler);
        multiplicationHandler.setNext(divisionHandler);

        additionHandler.handleRequest(10, 5, "+");
        additionHandler.handleRequest(10, 5, "-");
        additionHandler.handleRequest(10, 5, "*");
        additionHandler.handleRequest(10, 5, "/");


        additionHandler.handleRequest(10, 5, "%");
    }
}
