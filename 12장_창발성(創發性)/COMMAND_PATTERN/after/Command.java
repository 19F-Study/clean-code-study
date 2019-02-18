package COMMAND_PATTERN.after;

//문제를 해결하기 위해서는 구체적인 기능을 직접 구현하는 대신 실행될 기능을 캡슐화해야 한다.
public interface Command {
	public abstract void execute();
}
