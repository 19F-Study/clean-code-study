package COMMAND_PATTERN.before;

public class Main {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		AlarmButton lampBtn = new AlarmButton(lamp);
		lampBtn.pressed();

		//Lamp.turnOn() -> Alarm.start() 하고 싶다면?
		//Button 클래스를 변경해야 하기 때문에 개방폐쇄의 원 위반.
		Alarm alarm = new Alarm();
		LampButton alarmButton = new LampButton(alarm);
		alarmButton.processed();

		//버튼을 누르는 동작마다 다른 기능을 수행 하고 싶다면?
		//Button 클래스를 변경해야 하기 때문에
		AlarmLampButton alarmLampButton = new AlarmLampButton(lamp, alarm);
		alarmLampButton.setMode(Mode.ALARM);
		alarmLampButton.preseed();
		alarmLampButton.setMode(Mode.LAMP);
		alarmLampButton.preseed();
	}
}
