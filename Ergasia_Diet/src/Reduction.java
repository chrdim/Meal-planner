
public class Reduction extends Target {
	
	private double rateOfChange;
	
	public Reduction(Patient aPantient,double aRateOfChange) {
		super(aPantient);
		rateOfChange=aRateOfChange;
	}
	
	//override
	protected void calcMaintenanceCalories() {
		super.calcMaintenanceCalories();
		if(rateOfChange==0.5)
			calories=calories-100;
		else if(rateOfChange==1)
			calories=calories-200;
		else if(rateOfChange==1.5)
			calories=calories-300;
		else if(rateOfChange==2)
			calories=calories-400;
	}

	public double getRhythm() {
		return rateOfChange;
	}
	
	
	
}
