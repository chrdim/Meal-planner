import java.util.ArrayList;

public class Food {

	private String name;
	private double colories;
	private double protein;

	private double carbs;
	private String type;
	
	
	
	
	
	public Food(String aName,double someColories,double aProtein,double someCarbs,String aType) {
		name=aName;
		colories=someColories;
		protein=aProtein;
		carbs=someCarbs;
		type=aType;
		
		
	}
	
	public String getType() {
		return type;
	}
	
	public double getColories() {
		return colories;
	}
	public double getProtein() {
		return protein;
	}
	
	
	
	public double getCarbs() {
		return carbs;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
}
