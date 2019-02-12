package VISITOR_PATTERN;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}
