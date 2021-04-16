
public class Day {
	
	private Patient myPatient;
	private Target myTarget;
	private Meal breakFast;
	private Meal snack1;
	private Meal lunch;
	private Meal snack2;
	private Meal dinner;
	
	
	public Day(Patient aPatient,Target aTarget) {
		myPatient=aPatient;
		myTarget=aTarget;
		breakFast=new Meal(myPatient,myTarget,0.2,0.2,"Snack");
		snack1=new Meal(myPatient,myTarget,0.15,0.15,"Snack");
		lunch=new Meal(myPatient,myTarget,0.3,0.3,"lunch");
		snack2=new Meal(myPatient,myTarget,0.15,0.15,"Snack");
		dinner=new Meal(myPatient,myTarget,0.2,0.2,"lunch");
		
		
		
		
		
	}
	
	public Meal getBreakFast() {
		
		return breakFast;
	}
	
	public Meal getLunch() {
		return lunch;
	}
	
	public Meal getDinner() {
		return dinner;
	}
	
	public Meal getSnack1() {
		return snack1;
	}
	
	public Meal getSnack2() {
		return snack2;
	}
	

}
