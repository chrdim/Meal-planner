import javax.swing.JCheckBox;

public class CarbBasedMainMeals extends FoodTypePanel{

	private Food potato=new Food("�������",3.0,1.0,3.1,"lunch");
	private Food rice=new Food("����",2.0,1.0,3.1,"lunch");
	private Food bread=new Food("����",3.0,2.0,4.6,"lunch");
	private Food spaghetti=new Food("���������",4.0,2.0,3.6,"lunch");
	private Food groats=new Food("��������",2.5,1.0,2.6,"lunch");
	private Food lettuce=new Food("�������",1.7,1.0,1.6,"lunch");
	private Food tomato=new Food("�������",1.2,1.0,1.9,"lunch");
	private Food cucumber=new Food("�������",0.6,1.0,1.5,"lunch");
	private Food quinoa=new Food("�����",1.2,1.0,3.0,"lunch");
	private Food cabbage=new Food("������",0.8,1.0,1.3,"lunch");
	private Food sweetPotato=new Food("�����������",3.3,1.0,4.1,"lunch");
	private Food beet=new Food("��������",2.0,1.0,1.1,"lunch");
	
	
	
	private FoodCheckBox potatoCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox riceCheckBox=new FoodCheckBox("����");
	private FoodCheckBox breadCheckBox=new FoodCheckBox("����");
	private FoodCheckBox spaghettiCheckBox=new FoodCheckBox("���������");
	private FoodCheckBox groatsCheckBox=new FoodCheckBox("��������");
	private FoodCheckBox lettuceCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox tomatoCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox cucumberCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox quino�CheckBox=new FoodCheckBox("�����");
	private FoodCheckBox cabbageCheckBox=new FoodCheckBox("������");
	private FoodCheckBox sweetPotatoCheckBox=new FoodCheckBox("�����������");
	private FoodCheckBox beetCheckBox=new FoodCheckBox("��������");
	
	private int foodNum=0;
	
	
	
	public CarbBasedMainMeals(String aTitle,Patient aPatient) {
		super(aTitle,aPatient);
		
		foods.add(potato);
		foods.add(rice);
		foods.add(bread);
		foods.add(spaghetti);
		foods.add(groats);
		foods.add(lettuce);
		foods.add(tomato);
		foods.add(cucumber);
		foods.add(quinoa);
		foods.add(cabbage);
		foods.add(sweetPotato);
		foods.add(beet);
		
		
		foodCheckBoxes.add(potatoCheckBox);
		foodCheckBoxes.add(riceCheckBox);
		foodCheckBoxes.add(breadCheckBox);
		foodCheckBoxes.add(spaghettiCheckBox);
		foodCheckBoxes.add(groatsCheckBox);
		foodCheckBoxes.add(lettuceCheckBox);
		foodCheckBoxes.add(tomatoCheckBox);
		foodCheckBoxes.add(cucumberCheckBox);
		foodCheckBoxes.add(quino�CheckBox);
		foodCheckBoxes.add(cabbageCheckBox);
		foodCheckBoxes.add(sweetPotatoCheckBox);
		foodCheckBoxes.add(beetCheckBox);
	
		this.add(potatoCheckBox);
		this.add(riceCheckBox);
		this.add(breadCheckBox);
		this.add(spaghettiCheckBox);
		this.add(groatsCheckBox);
		this.add(lettuceCheckBox);
		this.add(tomatoCheckBox);
		this.add(cucumberCheckBox);
		this.add(quino�CheckBox);
		this.add(cabbageCheckBox);
		this.add(sweetPotatoCheckBox);
		this.add(beetCheckBox);
		
		potatoCheckBox.setBounds(20,30, 150, 20);
		riceCheckBox.setBounds(20, 50,150, 20);
		breadCheckBox.setBounds(20,70, 150,20);
		spaghettiCheckBox.setBounds(20,90, 150, 20);
		groatsCheckBox.setBounds(20, 110,150, 20);
		lettuceCheckBox.setBounds(20,130, 150,20);
		tomatoCheckBox.setBounds(170,30, 150, 20);
		cucumberCheckBox.setBounds(170, 50,150, 20);
		quino�CheckBox.setBounds(170, 70,150, 20);
		cabbageCheckBox.setBounds(170,90, 150,20);
		sweetPotatoCheckBox.setBounds(170,110, 150, 20);
		beetCheckBox.setBounds(170, 130,150, 20);
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
		if(foodNum<7) {
			
			
			return false;
			
		}else{
			
			
			return true;
		}
	}
}
