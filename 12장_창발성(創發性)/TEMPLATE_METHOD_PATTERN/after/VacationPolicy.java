package TEMPLATE_METHOD_PATTERN.after;

public abstract class VacationPolicy {
	public void accureVacation() {
		calculateBaseVacationHours();
		alterForLegalMinimums();
		applyToPayroll();
	}

	public void calculateBaseVacationHours() {

	}

	public void applyToPayroll() {

	}

	abstract protected void alterForLegalMinimums();

}
