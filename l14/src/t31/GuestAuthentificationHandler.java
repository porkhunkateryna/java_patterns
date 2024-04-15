package t31;

public class GuestAuthentificationHandler extends AuthentificationHandler {
    private static final String GUEST_USERNAME = "guest";

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Guest;
    }

    @Override
    protected void handleAuthentification(Account account) {
        System.out.println("Guest access provided!");
    }
}