package t31;

import java.util.Map;

public class AdminAuthentificationHandler extends AuthentificationHandler {
    private Map<String, String> adminsAccounts;

    public AdminAuthentificationHandler(Map<String, String> adminsAccounts) {
        this.adminsAccounts = adminsAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Administrator;
    }

    @Override
    protected void handleAuthentification(Account account) {
        String passwordFromAdminsStorage = adminsAccounts.get(account.getLogin());
        if (passwordFromAdminsStorage != null && passwordFromAdminsStorage.equals(account.getPassword()) && account.getPassword().length() >= 8) {
            System.out.println("Administrator access provided: " + account.getLogin());
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }
}