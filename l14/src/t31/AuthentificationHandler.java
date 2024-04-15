package t31;

public abstract class AuthentificationHandler {
    private AuthentificationHandler nextHandler;

    public AuthentificationHandler setNext(AuthentificationHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public void authenticate(Account account) {
        if (canHandle(account)) {
            handleAuthentification(account);
        } else if (nextHandler != null) {
            nextHandler.authenticate(account);
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }

    protected abstract boolean canHandle(Account account);
    protected abstract void handleAuthentification(Account account);
}

