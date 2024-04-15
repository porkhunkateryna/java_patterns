package t33;

public interface OperationHandler {
    void setNext(OperationHandler handler);
    void handleRequest(int number1, int number2, String operation);
}
