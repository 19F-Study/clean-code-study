package TEMPLATE_METHOD_PATTERN.before;

public class VacationPolicy {
	public void accuredUSDivisionVacation() {
		calculateBaseVacationHours();
		alterForUSLegalMinimums();
		applyToPayroll();
	}

	public void accureEUDivisionVacation() {
		calculateBaseVacationHours();
		alterForEULegalMinimums();
		applyToPayroll();
	}

	public void calculateBaseVacationHours() {

	}

	public void applyToPayroll() {

	}

	public void alterForUSLegalMinimums() {
		//US
	}

	public void alterForEULegalMinimums() {
		//EU
	}
}
