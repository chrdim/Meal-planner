import java.util.ArrayList;

public class Patient {

	private String name;
	private double age;
	private String target;
	private double height;
	private double weight;
	private String gender;
	private String activityLevel;
	
	
	private ArrayList<Food>proteins_preferences=new ArrayList();
	
	private ArrayList<Food>carbs_preferences=new ArrayList();
	
	public Patient(String aName,double anAge,double aHeight,double aWeight,String aGender,String anActivityLevel,String aTarget) {
		name=aName;
		age=anAge;
		height=aHeight;
		weight=aWeight;
		gender=aGender;
		activityLevel=anActivityLevel;
		target=aTarget;
		
	}
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public double getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getActivityLevel() {
		return activityLevel;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getTarget() {
		return target;
	}
	
	public void addProteinsBasesFood(Food aFood) {
		
		proteins_preferences.add(aFood);	
	}
	public void addCarbsBasesFood(Food aFood) {
		
		carbs_preferences.add(aFood);	
	}
	
	public void removeProteinsBasesFood(Food aFood) {
		
		proteins_preferences.remove(aFood);	
	}
	public void removeCarbsBasesFood(Food aFood) {
		
		carbs_preferences.remove(aFood);	
	}
	
	public ArrayList<Food> getProteinPreferences() {
		    
		return proteins_preferences;

	}
	
	public ArrayList<Food> getCarbsPreferences() {
	    
		return carbs_preferences;

	}
	
	
	
	
	
	
	
	
	
	
}
