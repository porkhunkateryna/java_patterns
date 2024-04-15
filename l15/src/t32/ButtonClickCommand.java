package t32;

public class ButtonClickCommand implements Command {
    private Button button;

    public ButtonClickCommand(Button button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}