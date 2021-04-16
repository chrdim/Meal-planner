
public abstract class Target {

	protected double calories;
	protected int proteinsKilogramms;
	protected int fatsKilogramms;
	protected int carbsKilogramms;
	protected Patient myPatient;
	
	public Target(Patient aPatient) {
		myPatient=aPatient;
		calcMaintenanceCalories();
		
	}
	
	protected void calcMaintenanceCalories() {
		if(myPatient.getGender().equals("’ντρας")) {
			calories=66 + (13.7 * myPatient.getWeight()) + (5 * myPatient.getHeight()) - (6.8 * myPatient.getAge());
		
		}else if(myPatient.getGender().equals("Γυναίκα")) {
			calories=655 + (9.6 * myPatient.getWeight()) + (1.8 * myPatient.getHeight()) - (4.7 * myPatient.getAge());
		}
		
		if(myPatient.getActivityLevel().equals("0.5")) {
			calories=calories*1.2;
		}else if(myPatient.getActivityLevel().equals("1")){
			calories=calories*1.375;
		}else if(myPatient.getActivityLevel().equals("1.5")) {
			calories=calories*1.55;
		}else if(myPatient.getActivityLevel().equals("2")) {
			calories=calories*1.725;
		}
		
		
	}
	
	protected void calcProteinKilogramms() {
		double proteinsCalories=calories*30/100;
		double div=(proteinsCalories/4);
		proteinsKilogramms=(int)Math.round (div);
		
	}
	
	protected void calcCarbsKilogramms() {
		double carbsCalories=calories*50/100;
		double div=carbsCalories/4;
		carbsKilogramms=(int)Math.round (div);
	}
	
	protected void calcFatsKilogramms() {
		double fatsCalories=calories*20/100;
		double div=fatsCalories/9;
		fatsKilogramms=(int)Math.round (div);
	}
	
	public double getProteinsKiloGramms() {
		
		calcProteinKilogramms();
		
		return proteinsKilogramms;
	}
	
	public double getCarbsKiloGramms() {
		
		calcCarbsKilogramms();
		
		return carbsKilogramms;
	}
	
	public double getFatsKiloGramms() {
		
		calcFatsKilogramms();
		
		return fatsKilogramms;
		
	}
	
	public abstract double getRhythm();
		
	
	public double getCalories() {
		
		calcMaintenanceCalories();
		return calories;
		
	}
	
}
