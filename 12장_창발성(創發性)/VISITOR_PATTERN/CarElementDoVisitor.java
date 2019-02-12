package VISITOR_PATTERN;

public class CarElementDoVisitor implements CarElementVisitor {
	@Override
	public void visit(Wheel wheel) {
		System.out.println("Do wheel");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Do engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Do Body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Do Car");
	}
}
