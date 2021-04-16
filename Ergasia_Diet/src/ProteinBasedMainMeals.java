import javax.swing.JCheckBox;

public class ProteinBasedMainMeals  extends FoodTypePanel{

	private Food chicken=new Food("���������",4.0,4.0,0.8,"lunch");
	private Food beef=new Food("������",5.0,3.0,0.4,"lunch");
	private Food turkey=new Food("���������",9.0,2.0,0.8,"lunch");
	private Food dorado=new Food("��������",5.0,6.0,1.1,"lunch");
	private Food anchovy=new Food("�������",3.0,4.0,0.7,"lunch");
	private Food beans=new Food("�������",4.0,2.0,1.8,"lunch");
	private Food lentils=new Food("�����",3.0,1.0,1.4,"lunch");
	private Food chickpeas=new Food("�������",3.0,4.0,1.1,"lunch");
	private Food eggs=new Food("����",9.0,7.0,0.8,"lunch");
	
	private Food peas=new Food("������",3.0,1.0,1.4,"lunch");
	private Food mushrooms=new Food("���������",3.0,4.0,1.1,"lunch");
	private Food entamame=new Food("��������",4.0,7.0,0.8,"lunch");
	
	private FoodCheckBox chickenCheckBox=new FoodCheckBox("���������");
	private FoodCheckBox beefCheckBox=new FoodCheckBox("������");
	private FoodCheckBox turkeyCheckBox=new FoodCheckBox("���������");
	private FoodCheckBox doradoCheckBox=new FoodCheckBox("��������");
	private FoodCheckBox anchovyCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox beansCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox lentilsCheckBox=new FoodCheckBox("�����");
	private FoodCheckBox chickpeasCheckBox=new FoodCheckBox("�������");
	private FoodCheckBox eggsCheckBox=new FoodCheckBox("����");
	
	private FoodCheckBox peasCheckBox=new FoodCheckBox("������");
	private FoodCheckBox mushroomsCheckBox=new FoodCheckBox("���������");
	private FoodCheckBox entamameCheckBox=new FoodCheckBox("��������");
	
	private int foodNum=0;
	
	
	public ProteinBasedMainMeals(String aTitle,Patient aPatient) {
		super(aTitle,aPatient);
		
		
		foods.add(chicken);
		foods.add(beef);
		foods.add(turkey);
		foods.add(dorado);
		foods.add(anchovy);
		foods.add(beans);
		foods.add(lentils);
		foods.add(chickpeas);
		foods.add(eggs);
		
		foods.add(peas);
		foods.add(mushrooms);
		foods.add(entamame);
		
		foodCheckBoxes.add(chickenCheckBox);
		foodCheckBoxes.add(beefCheckBox);
		foodCheckBoxes.add(turkeyCheckBox);
		foodCheckBoxes.add(doradoCheckBox);
		foodCheckBoxes.add(anchovyCheckBox);
		foodCheckBoxes.add(beansCheckBox);
		foodCheckBoxes.add(lentilsCheckBox);
		foodCheckBoxes.add(chickpeasCheckBox);
		foodCheckBoxes.add(eggsCheckBox);
		
		foodCheckBoxes.add(peasCheckBox);
		foodCheckBoxes.add(mushroomsCheckBox);
		foodCheckBoxes.add(entamameCheckBox);
		
		
		
		
		this.add(chickenCheckBox);
		this.add(beefCheckBox);
		this.add(turkeyCheckBox);
		this.add(doradoCheckBox);
		this.add(anchovyCheckBox);
		this.add(beansCheckBox);
		this.add(lentilsCheckBox);
		this.add(chickpeasCheckBox);
		this.add(eggsCheckBox);
		
		this.add(peasCheckBox);
		this.add(mushroomsCheckBox);
		this.add(entamameCheckBox);
		
		chickenCheckBox.setBounds(20,30, 150, 20);
		beefCheckBox.setBounds(20, 50,150, 20);
		turkeyCheckBox.setBounds(20,70, 150,20);
		doradoCheckBox.setBounds(20,90, 150, 20);
		anchovyCheckBox.setBounds(20, 110,150, 20);
		beansCheckBox.setBounds(20,130, 150,20);
		lentilsCheckBox.setBounds(170,30, 150, 20);
		chickpeasCheckBox.setBounds(170, 50,150, 20);
		eggsCheckBox.setBounds(170,70, 150,20);
		
		peasCheckBox.setBounds(170,90, 150, 20);
		mushroomsCheckBox.setBounds(170, 110,150, 20);
		entamameCheckBox.setBounds(170,130, 150,20);
		
		
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
		if(foodNum<7) {
			
			return false;
			
		}else {
			
			return true;
		}
		
		
		}
		
	
	
}
