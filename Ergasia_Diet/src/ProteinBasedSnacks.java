import javax.swing.JCheckBox;

public class ProteinBasedSnacks extends FoodTypePanel{
	
	private Food yogurt=new Food("Γιαούρτι",2.0,3.0,0.8,"Snack");
	private Food milk=new Food("Γάλα",1.3,3.0,0.4,"Snack");
	private Food almonds=new Food("Αμύγδαλα",1.1,2.6,3.8,"Snack");
	private Food walnuts=new Food("Καρύδια",3.2,2.8,3.8,"Snack");
	private Food cashews=new Food("Κάσιους",4.4,2.6,3.8,"Snack");
	private Food cottage=new Food("Κόταντζ",3.5,2.9,0.4,"Snack");
	private Food cheese=new Food("Κίτρινο Τυρί",2.8,3.0,1.4,"Snack");
	
	private Food creamCheese=new Food("Ανθότυρο",2.0,3.0,0.8,"Snack");
	private Food peanutButter=new Food("Φυστικοβούτυρο",4.0,2.2,1.4,"Snack");
	private Food tofu=new Food("Τοφού",4.0,3.3,1.8,"Snack");
	private Food pumpkinSeeds=new Food("Κολοκυθόσποροι",9.0,2.3,3.8,"Snack");
	private Food hummus=new Food("Χούμους",2.0,2.2,2.8,"Snack");
	private Food chocolate=new Food("Σοκολάτα",4.0,3.1,1.4,"Snack");
	
	private FoodCheckBox yogurtCheckBox=new FoodCheckBox("Γιαούρτι");
	private FoodCheckBox milkCheckBox=new FoodCheckBox("Γάλα");
	private FoodCheckBox almondsCheckBox=new FoodCheckBox("Αμύγδαλα");
	private FoodCheckBox walnutsCheckBox=new FoodCheckBox("Καρύδια");
	private FoodCheckBox cashewsCheckBox=new FoodCheckBox("Κάσιους");
	private FoodCheckBox cottageCheckBox=new FoodCheckBox("Κόταντζ");
	private FoodCheckBox cheeseCheckBox=new FoodCheckBox("Κίτρινο Τυρί");
	
	private FoodCheckBox creamCheeseCheckBox=new FoodCheckBox("Ανθότυρο");
	private FoodCheckBox peanutButterCheckBox=new FoodCheckBox("Φυστικοβούτυρο");
	private FoodCheckBox tofuCheckBox=new FoodCheckBox("Τοφού");
	private FoodCheckBox pumpkinSeedsCheckBox=new FoodCheckBox("Κολοκυθόσποροι");
	private FoodCheckBox hummusCheckBox=new FoodCheckBox("Χούμους");
	private FoodCheckBox chocolateCheckBox=new FoodCheckBox("Σοκολάτα");
	
	private int foodNum=0;
	
	public ProteinBasedSnacks(String aTitle,Patient aPatient) {
		super(aTitle,aPatient);
		
		foods.add(yogurt);
		foods.add(milk);
		foods.add(almonds);
		foods.add(walnuts);
		foods.add(cashews);
		foods.add(cottage);
		foods.add(cheese);
		
		foods.add(creamCheese);
		foods.add(peanutButter);
		foods.add(tofu);
		foods.add(pumpkinSeeds);
		foods.add(hummus);
		foods.add(chocolate);
		
		
		foodCheckBoxes.add(yogurtCheckBox);
		foodCheckBoxes.add(milkCheckBox);
		foodCheckBoxes.add(almondsCheckBox);
		foodCheckBoxes.add(walnutsCheckBox);
		foodCheckBoxes.add(cashewsCheckBox);
		foodCheckBoxes.add(cottageCheckBox);
		foodCheckBoxes.add(cheeseCheckBox);
		
		foodCheckBoxes.add(creamCheeseCheckBox);
		foodCheckBoxes.add(peanutButterCheckBox);
		foodCheckBoxes.add(tofuCheckBox);
		foodCheckBoxes.add(pumpkinSeedsCheckBox);
		foodCheckBoxes.add(hummusCheckBox);
		foodCheckBoxes.add(chocolateCheckBox);
		
		
		
		
		
		this.add(yogurtCheckBox);
		this.add(milkCheckBox);
		this.add(almondsCheckBox);
		this.add(walnutsCheckBox);
		this.add(cashewsCheckBox);
		this.add(cottageCheckBox);
		this.add(cheeseCheckBox);
		
		this.add(creamCheeseCheckBox);
		this.add(peanutButterCheckBox);
		this.add(tofuCheckBox);
		this.add(pumpkinSeedsCheckBox);
		this.add(hummusCheckBox);
		this.add(chocolateCheckBox);
		
		yogurtCheckBox.setBounds(20,30, 150, 20);
		milkCheckBox.setBounds(20, 50,150, 20);
		almondsCheckBox.setBounds(20,70, 150,20);
		walnutsCheckBox.setBounds(20,90, 150, 20);
		cashewsCheckBox.setBounds(20, 110,150, 20);
		cottageCheckBox.setBounds(20,130, 150,20);
		cheeseCheckBox.setBounds(170,30, 150, 20);
		
		creamCheeseCheckBox.setBounds(170, 50,150, 20);
		peanutButterCheckBox.setBounds(170,70, 150,20);
		tofuCheckBox.setBounds(170,90, 150, 20);
		pumpkinSeedsCheckBox.setBounds(170, 110,150, 20);
		hummusCheckBox.setBounds(170,130, 150,20);
		chocolateCheckBox.setBounds(170,30, 150, 20);
		
	}
	
	
	
	public boolean examineCheckBoxes() {
		foodNum=0;
		
		
		
		
		for(FoodCheckBox box:foodCheckBoxes) {
			if(box.isSelected()==true) {
				for(Food food:foods) {
					if(box.getText().equals(food.getName())) {
						
							myPatient.addProteinsBasesFood(food);
							
							
						
							foodNum++;
							
							
						}
						
					
				}
			}
		}
		if(foodNum<5) {
			
			return false;
			
		}else{
			
			
			return true;
		}
	}

}
