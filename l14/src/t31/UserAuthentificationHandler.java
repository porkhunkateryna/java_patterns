package t31;

import java.util.Map;

public class UserAuthentificationHandler extends AuthentificationHandler {
    private Map<String, String> usersAccounts;

    public UserAuthentificationHandler(Map<String, String> usersAccounts) {
        this.usersAccounts = usersAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.User;
    }

    @Override
    protected void handleAuthentification(Account account) {
        String passwordFromUserStorage = usersAccounts.get(account.getLogin());
        if (passwordFromUserStorage != null && passwordFromUserStorage.equals(account.getPassword())) {
            System.out.println("User access provided: " + account.getLogin());
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }
}