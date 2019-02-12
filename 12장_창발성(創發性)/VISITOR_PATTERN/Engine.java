package VISITOR_PATTERN;

public class Engine implements CarElement {
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
