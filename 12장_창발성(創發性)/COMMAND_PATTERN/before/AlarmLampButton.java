package COMMAND_PATTERN.before;

enum Mode {LAMP, ALARM};

public class AlarmLampButton {
	private Lamp lamp;
	private Alarm alarm;
	private Mode mode;

	public AlarmLampButton(Lamp lamp, Alarm alarm) {
		this.lamp = lamp;
		this.alarm = alarm;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void preseed() {
		switch (mode) {
			case LAMP: lamp.turnOn(); break;
			case ALARM: alarm.start(); break;
		}
	}
}
