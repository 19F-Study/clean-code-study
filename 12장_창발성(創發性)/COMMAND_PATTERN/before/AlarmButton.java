package COMMAND_PATTERN.before;

public class AlarmButton {
	private Lamp lamp;

	public AlarmButton(Lamp lamp) {
		this.lamp = lamp;
	}

	public void pressed() {
		lamp.turnOn();
	}
}
