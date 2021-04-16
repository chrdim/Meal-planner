import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayDietPanel extends JPanel{
	
	private JLabel dayLabel;
	private mealTypeLabel breakFast=new mealTypeLabel("Πρωινό");
	private mealTypeLabel snack1=new mealTypeLabel("Σνακ 1");
	private mealTypeLabel lunch=new mealTypeLabel("Μεσημεριανό");
	private mealTypeLabel snack2=new mealTypeLabel("Σνακ 2");
	private mealTypeLabel dinner=new mealTypeLabel("Βραδινό");
	
	private FoodNQuantitiesLabel food1;
	private FoodNQuantitiesLabel food2;

	private FoodNQuantitiesLabel food3;
	private FoodNQuantitiesLabel food4;

	private FoodNQuantitiesLabel food5;
	private FoodNQuantitiesLabel food6;
	
	private FoodNQuantitiesLabel food7;
	private FoodNQuantitiesLabel food8;
	
	private FoodNQuantitiesLabel food9;
	private FoodNQuantitiesLabel food10;
	
	private ArrayList<Food>selected_proteinBased=new ArrayList<Food>();
	private ArrayList<Food>selected_carbBased=new ArrayList<Food>();
	
	
	private Day myDay;
	private Patient myPatient;
	
	
	public DayDietPanel(String aDay,Day aday,Patient aPatient) {
		
		myPatient=aPatient;
		myDay=aday;
		
		
		dayLabel=new JLabel(aDay);
		dayLabel.setFont(new Font("Calibri Light",Font.ITALIC, 25));
		dayLabel.setForeground(Color.WHITE);
		dayLabel.setBackground(null);
		
		this.add(dayLabel);
		dayLabel.setBounds(120, 0, 500, 50);
		
		this.add(breakFast);
		this.add(snack1);
		this.add(lunch);
		this.add(snack2);
		this.add(dinner);
		
		food1=new FoodNQuantitiesLabel(myDay.getBreakFast().getFoods().get(0).getName()+" "+myDay.getBreakFast().getGramms().get(0).toString()+"gr");
		selected_proteinBased.add(myDay.getBreakFast().getFoods().get(0));
		myPatient.removeProteinsBasesFood(myDay.getBreakFast().getFoods().get(0));
		
		food2=new FoodNQuantitiesLabel(myDay.getBreakFast().getFoods().get(1).getName()+" "+myDay.getBreakFast().getGramms().get(1).toString()+"gr");
		selected_carbBased.add(myDay.getBreakFast().getFoods().get(1));
		myPatient.removeCarbsBasesFood(myDay.getBreakFast().getFoods().get(1));
		
		food3=new FoodNQuantitiesLabel(myDay.getSnack1().getFoods().get(0).getName()+" "+myDay.getSnack1().getGramms().get(0).toString()+"gr");
		selected_proteinBased.add(myDay.getSnack1().getFoods().get(0));
		myPatient.removeProteinsBasesFood(myDay.getSnack1().getFoods().get(0));
		
		food4=new FoodNQuantitiesLabel(myDay.getSnack1().getFoods().get(1).getName()+" "+myDay.getSnack1().getGramms().get(1).toString()+"gr");
		selected_carbBased.add(myDay.getSnack1().getFoods().get(1));
		myPatient.removeCarbsBasesFood(myDay.getSnack1().getFoods().get(1));
		
		food5=new FoodNQuantitiesLabel(myDay.getLunch().getFoods().get(0).getName()+" "+myDay.getLunch().getGramms().get(0).toString()+"gr");
		selected_proteinBased.add(myDay.getLunch().getFoods().get(0));
		myPatient.removeProteinsBasesFood(myDay.getLunch().getFoods().get(0));
		
		food6=new FoodNQuantitiesLabel(myDay.getLunch().getFoods().get(1).getName()+" "+myDay.getLunch().getGramms().get(1).toString()+"gr");
		selected_carbBased.add(myDay.getLunch().getFoods().get(1));
		myPatient.removeCarbsBasesFood(myDay.getLunch().getFoods().get(1));
		
		food7=new FoodNQuantitiesLabel(myDay.getSnack2().getFoods().get(0).getName()+" "+myDay.getSnack2().getGramms().get(0).toString()+"gr");
		selected_proteinBased.add(myDay.getSnack2().getFoods().get(0));
		myPatient.removeProteinsBasesFood(myDay.getSnack2().getFoods().get(0));
		
		food8=new FoodNQuantitiesLabel(myDay.getSnack2().getFoods().get(1).getName()+" "+myDay.getSnack2().getGramms().get(1).toString()+"gr");
		selected_carbBased.add(myDay.getSnack2().getFoods().get(1));
		myPatient.removeCarbsBasesFood(myDay.getSnack2().getFoods().get(1));
		
		food9=new FoodNQuantitiesLabel(myDay.getDinner().getFoods().get(0).getName()+" "+myDay.getDinner().getGramms().get(0).toString()+"gr");
		selected_proteinBased.add(myDay.getDinner().getFoods().get(0));
		myPatient.removeProteinsBasesFood(myDay.getDinner().getFoods().get(0));
		
		food10=new FoodNQuantitiesLabel(myDay.getDinner().getFoods().get(1).getName()+" "+myDay.getDinner().getGramms().get(1).toString()+"gr");
		selected_carbBased.add(myDay.getDinner().getFoods().get(1));
		myPatient.removeCarbsBasesFood(myDay.getDinner().getFoods().get(1));
		
		
		for(Food f:selected_proteinBased) {
			myPatient.addProteinsBasesFood(f);
		}
		
		for(Food f:selected_carbBased) {
			myPatient.addCarbsBasesFood(f);
		}
		
		food1.setBounds(20, 75, 500, 20);
		food2.setBounds(20, 95, 500, 20);
		
		food3.setBounds(20, 145, 500, 20);
		food4.setBounds(20, 165, 500, 20);
		
		food5.setBounds(20, 215, 500, 20);
		food6.setBounds(20, 235, 500, 20);
		
		food7.setBounds(20, 285, 500, 20);
		food8.setBounds(20, 305, 500, 20);
		
		food9.setBounds(20, 355, 500, 20);
		food10.setBounds(20, 375, 500, 20);
		
		this.add(food1);
		this.add(food2);
		this.add(food3);
		this.add(food4);
		this.add(food5);
		this.add(food6);
		this.add(food7);
		this.add(food8);
		this.add(food9);
		this.add(food10);
		
		
		
		
		
		
		this.setBackground(new Color(128, 179, 229));
		this.setLayout(null);
		this.setSize(325,400);
		this.setLocation(10,50);
		
	}

}
