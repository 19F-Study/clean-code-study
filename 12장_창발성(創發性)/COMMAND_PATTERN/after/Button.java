package COMMAND_PATTERN.after;

public class Button {
	private Command command;

	public Button(Command command) {
		setCommand(command);
	}

	public void setCommand(Command newCommand) {
		this.command = newCommand;
	}

	public void pressed() {
		command.execute();
	}
}
