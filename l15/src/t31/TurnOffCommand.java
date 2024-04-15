package t31;

public class TurnOffCommand implements Command {
    private Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOff();
    }
}
