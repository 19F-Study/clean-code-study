package VISITOR_PATTERN;

public class CarElementStopVisitor implements CarElementVisitor {
	@Override
	public void visit(Wheel wheel) {
		System.out.println("Stop wheel");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Stop engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Stop body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Stop car");
	}
}
