package COMMAND_PATTERN.before;

public class LampButton {
	private Alarm alarm;

	public LampButton(Alarm alarm) {
		this.alarm = alarm;
	}

	public void processed() {
		alarm.start();
	}
}
