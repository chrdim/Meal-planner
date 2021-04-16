import java.util.ArrayList;
import java.util.Random;

public class Meal {

	private int MealProteinKilogramms;
	private int MealCarbsKilogramms;
	
	
	private  double posostoProtein;
	private  double posostoCarbs;
	
	
	private Patient myPatient;
	private Target myTarget;
	
	private Food ProteinBasedFood;
	private Food CarbsBasedFood;
	
	
	private ArrayList<Food>proteins_based=new ArrayList();
	
	private ArrayList<Food>carbs_based=new ArrayList();
	
	private ArrayList<Food> plate =new ArrayList();
	private ArrayList<Integer> amount=new ArrayList();
	
	private String MealType;
	
	
	
	

	public Meal(Patient aPatient,Target aTarget,double aPosostoProtein,double aPosostoCarbs,String aType) {
		
		myPatient=aPatient;
		myTarget=aTarget;
		posostoProtein=aPosostoProtein;
		posostoCarbs=aPosostoCarbs;
		
		MealType=aType;
		
		
		
	}
	
	public void calcProtein() {
		
		
		
		MealProteinKilogramms=(int)Math.round(myTarget.getProteinsKiloGramms()*posostoProtein);
		
		
		
	}
	
	public void calcCarbs() {
		
		MealCarbsKilogramms=(int)Math.round(myTarget.getCarbsKiloGramms()*posostoCarbs);
		
		
	}
	
	
	public void ProteinIsolation() {
		for(Food myFood:myPatient.getProteinPreferences()) {
			if (myFood.getType().equals(MealType)){
				proteins_based.add(myFood);
			}
		}
	}
	
	public void CarbsIsolation() {
		for(Food myFood:myPatient.getCarbsPreferences()) {
			if (myFood.getType().equals(MealType)){
				carbs_based.add(myFood);
			}
		}
	}
	
	
	
	
	
	
	
	public void pickFoods() {
	
		

		ProteinIsolation();
		CarbsIsolation();
		
		
		int position1=(int) (Math.random() * ((proteins_based.size()-1)- 0)) + 0;
		ProteinBasedFood=proteins_based.get(position1);
		plate.add(ProteinBasedFood);
		amount.add(0);
		MealProteinKilogramms=MealProteinKilogramms-(int)Math.round(ProteinBasedFood.getProtein());
		MealCarbsKilogramms=MealCarbsKilogramms-(int)Math.round(ProteinBasedFood.getCarbs());
		
		
		int position2=(int) (Math.random() * ((carbs_based.size()-1)- 0)) + 0;
		CarbsBasedFood=carbs_based.get(position2);
		plate.add(CarbsBasedFood);
		amount.add(0);
		MealProteinKilogramms=MealProteinKilogramms-(int)Math.round(CarbsBasedFood.getProtein());
		MealCarbsKilogramms=MealCarbsKilogramms-(int)Math.round(CarbsBasedFood.getCarbs());
		
		
		
		
		
		
	}
	
	public void setGramms() {
		
			calcProtein();
			calcCarbs();
			
			
			
			
		
			while(MealProteinKilogramms>0) {
			
				
				amount.set(0,amount.get(0)+10);
				MealProteinKilogramms=MealProteinKilogramms-(int)Math.round(ProteinBasedFood.getProtein());
				MealCarbsKilogramms=MealCarbsKilogramms-(int)Math.round(ProteinBasedFood.getCarbs());
				
			
			
				
			}
			
			while(MealCarbsKilogramms>0) {
				
				amount.set(1,amount.get(1)+5);
				
				MealProteinKilogramms=MealProteinKilogramms-(int)Math.round(CarbsBasedFood.getProtein());
				MealCarbsKilogramms=MealCarbsKilogramms-(int)Math.round(CarbsBasedFood.getCarbs());
				
			}
			
		
			
			
			
	}
	
	
	
	
	public ArrayList<Food> getFoods() {
		
		pickFoods();
		setGramms();
		
		
		return plate;
		
	}
	
	public ArrayList<Integer> getGramms(){
		
		return amount;
	}
	
	
}
	
	
	

