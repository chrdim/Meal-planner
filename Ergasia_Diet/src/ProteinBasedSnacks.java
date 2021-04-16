import javax.swing.JCheckBox;

public class ProteinBasedSnacks extends FoodTypePanel{
	
	private Food yogurt=new Food("��������",2.0,3.0,0.8,"Snack");
	private Food milk=new Food("����",1.3,3.0,0.4,"Snack");
	private Food almonds=new Food("��������",1.1,2.6,3.8,"Snack");
	private Food walnuts=new Food("�������",3.2,2.8,3.8,"Snack");
	private Food cashews=new Food("�������",4.4,2.6,3.8,"Snack");
	private Food cottage=new Food("�������",3.5,2.9,0.4,"Snack");
	private Food cheese=new Food("������� ����",2.8,3.0,1.4,"Snack");
	
	private Food creamCheese=new Food("��������",2.0,3.0,0.8,"Snack");
	private Food peanutButter=new Food("��������������",4.0,2.2,1.4,"Snack");
	private Food tofu=new Food("�����",4.0,3.3,1.8,"Snack");
	private Food pumpkinSeeds=new Food("��������������",9.0,2.3,3.8,"Snack");
	private Food hummus=new Food("�������",2.0,2.2,2.8,"Snack");
	private Food chocolate=new Food("��������",4.0,3.1,1.4,"Snack");
	
	private FoodCheckBox yogurtCheckBox=new FoodCheckBox("��������");
	private FoodCheckBox milkCheckBox=new FoodCheckBox("����");
	private FoodCheckBox almondsCheckBox=new FoodCheckBox("��������");
	private FoodCheckBox walnutsCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox cashewsCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox cottageCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox cheeseCheckBox=new FoodCheckBox("������� ����");
	
	private FoodCheckBox creamCheeseCheckBox=new FoodCheckBox("��������");
	private FoodCheckBox peanutButterCheckBox=new FoodCheckBox("��������������");
	private FoodCheckBox tofuCheckBox=new FoodCheckBox("�����");
	private FoodCheckBox pumpkinSeedsCheckBox=new FoodCheckBox("��������������");
	private FoodCheckBox hummusCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox chocolateCheckBox=new FoodCheckBox("��������");
	
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
