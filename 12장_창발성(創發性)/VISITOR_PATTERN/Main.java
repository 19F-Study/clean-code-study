package VISITOR_PATTERN;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.accept(new CarElementDoVisitor());
		car.accept(new CarElementStopVisitor());
	}

}
