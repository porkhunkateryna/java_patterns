package t32;

public class ShortcutPressCommand implements Command {
    private Shortcut shortcut;

    public ShortcutPressCommand(Shortcut shortcut) {
        this.shortcut = shortcut;
    }

    @Override
    public void execute() {
        shortcut.press();
    }
}
