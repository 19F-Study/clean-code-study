package COMMAND_PATTERN.after;

public class Main {
	//Button 클래스를 수정하지 않고 다양한 동작 구현 가능.
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);

		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmStartCommand(alarm);

		Button btn = new Button(alarmOnCommand);
		btn.pressed();

		btn.setCommand(lampOnCommand);
		btn.pressed();
	}
}
