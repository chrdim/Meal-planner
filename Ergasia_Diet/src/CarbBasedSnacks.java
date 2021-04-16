import javax.swing.JCheckBox;

public class CarbBasedSnacks extends FoodTypePanel{
	

	private Food honey=new Food("Μέλι",3.0,2.0,3.8,"Snack");
	private Food banana=new Food("Μπανάνα",1.0,2.0,3.8,"Snack");
	private Food oats=new Food("Βρώμη",3.0,2.0,2.2,"Snack");
	private Food orange=new Food("Πορτοκάλι",2.0,2.0,2.1,"Snack");
	private Food riceWafers=new Food("Ρυζογκοφρέτες",1.2,1.0,3.0,"Snack");
	private Food jar=new Food("Μαρμελάδα",1.2,3.0,2.2,"Snack");
	
	private Food cereals=new Food("Δημητριακά",2.0,3.0,4.8,"Snack");
	private Food apple=new Food("Μήλο",2.0,1.0,3.8,"Snack");
	private Food pineapple=new Food("Aνανάς",1.5,1.0,4.9,"Snack");
	private Food grapes=new Food("Σταφίδες",3.0,1.0,3.6,"Snack");
	private Food avocado=new Food("Αβοκάντο",2.0,1.0,2.8,"Snack");
	private Food mango=new Food("Μάνγκο",3.3,1.0,4.2,"Snack");
	
	
	private FoodCheckBox honeyCheckBox=new FoodCheckBox("Μέλι");
	private FoodCheckBox bananaCheckBox=new FoodCheckBox("Μπανάνα");
	private FoodCheckBox oatsCheckBox=new FoodCheckBox("Βρώμη");
	private FoodCheckBox orangeSnackCheckBox=new FoodCheckBox("Πορτοκάλι");
	private FoodCheckBox riceWafersCheckBox=new FoodCheckBox("Ρυζογκοφρέτες");
	private FoodCheckBox jarCheckBox=new FoodCheckBox("Μαρμελάδα");
	
	private FoodCheckBox cerealCheckBox=new FoodCheckBox("Δημητριακά");
	private FoodCheckBox appleCheckBox=new FoodCheckBox("Μήλο");
	private FoodCheckBox pineappleCheckBox=new FoodCheckBox("Ανανάς");
	private FoodCheckBox grapesSnackCheckBox=new FoodCheckBox("Σταφίδες");
	private FoodCheckBox avocadoCheckBox=new FoodCheckBox("Αβοκάντο");
	private FoodCheckBox mangoCheckBox=new FoodCheckBox("Μάνγκο");
	
	private int foodNum=0;
	
	
	public CarbBasedSnacks(String aTitle,Patient aPatient) {
		super(aTitle,aPatient);
		
		foods.add(honey);
		foods.add(banana);
		foods.add(oats);
		foods.add(orange);
		foods.add(riceWafers);
		foods.add(jar);
		
		foods.add(cereals);
		foods.add(apple);
		foods.add(pineapple);
		foods.add(grapes);
		foods.add(avocado);
		foods.add(mango);
		
		
		foodCheckBoxes.add(honeyCheckBox);
		foodCheckBoxes.add(bananaCheckBox);
		foodCheckBoxes.add(oatsCheckBox);
		foodCheckBoxes.add(orangeSnackCheckBox);
		foodCheckBoxes.add(riceWafersCheckBox);
		foodCheckBoxes.add(jarCheckBox);
		
		foodCheckBoxes.add(cerealCheckBox);
		foodCheckBoxes.add(appleCheckBox);
		foodCheckBoxes.add(pineappleCheckBox);
		foodCheckBoxes.add(grapesSnackCheckBox);
		foodCheckBoxes.add(avocadoCheckBox);
		foodCheckBoxes.add(mangoCheckBox);
		
		
		
		
		this.add(honeyCheckBox);
		this.add(bananaCheckBox);
		this.add(oatsCheckBox);
		this.add(orangeSnackCheckBox);
		this.add(riceWafersCheckBox);
		this.add(jarCheckBox);
		
		this.add(cerealCheckBox);
		this.add(appleCheckBox);
		this.add(pineappleCheckBox);
		this.add(grapesSnackCheckBox);
		this.add(avocadoCheckBox);
		this.add(mangoCheckBox);
		
		honeyCheckBox.setBounds(20,30, 150, 20);
		bananaCheckBox.setBounds(20, 50,150, 20);
		oatsCheckBox.setBounds(20,70, 150,20);
		orangeSnackCheckBox.setBounds(20,90, 150, 20);
		riceWafersCheckBox.setBounds(20, 110,150, 20);
		jarCheckBox.setBounds(20,130, 150,20);
		
		cerealCheckBox.setBounds(170,30, 150, 20);
		appleCheckBox.setBounds(170, 50,150, 20);
		pineappleCheckBox.setBounds(170,70, 150,20);
		grapesSnackCheckBox.setBounds(170,90, 150, 20);
		avocadoCheckBox.setBounds(170, 110,150, 20);
		mangoCheckBox.setBounds(170,130, 150,20);
		
	}

	public boolean examineCheckBoxes() {
		
		foodNum=0;
		
		
		for(FoodCheckBox box:foodCheckBoxes) {
			if(box.isSelected()==true) {
				for(Food food:foods) {
					if(box.getText().equals(food.getName())) {
					
							myPatient.addCarbsBasesFood(food);
							
							
						
							foodNum++;
							
							
					
					}
				}
			}
		}
		if(foodNum<5) {
			
			
			
			return false;
			
			
			
		}else {
		
			
			return true;
		}
	
	}
}
