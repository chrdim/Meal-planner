import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypeOfMacroSourceFood extends JPanel{

	private String myMacroType;
	private ProteinBasedSnacks proteinSnackPanel;
	private CarbBasedSnacks carbSnackPanel;
	private ProteinBasedMainMeals proteinMainMealsPanel;
	private CarbBasedMainMeals carbMainMealsPanel;
	//private JLabel proteinFoodsLabel;
	//private JLabel carbsFoodsLabel;
	private JLabel sourcesLabel;
	private Patient myPatient;
	
	
	public TypeOfMacroSourceFood(String aMacroType,Patient aPatient) {
		
		myPatient=aPatient;
		
		myMacroType=aMacroType;
		
		this.setBackground( new Color(128, 179, 229) );
		this.setLayout(null);
		this.setSize(350, 450);
		this.setLocation(40,180);
		

		
		
		
		sourcesLabel=new JLabel("Πηγές");
		sourcesLabel.setFont(new Font("Calibri",Font.ITALIC, 26));
		sourcesLabel.setForeground(Color.white);
		sourcesLabel.setBackground(null);
		sourcesLabel.setBounds(130, 10, 200, 26);
		this.add(sourcesLabel);
		
		/*proteinFoodsLabel=new JLabel("Πρωτείνης");
		proteinFoodsLabel.setFont(new Font("Calibri",Font.ITALIC, 20));
		proteinFoodsLabel.setBackground(null);
		proteinFoodsLabel.setBounds(50, 55, 200, 20);
		this.add(proteinFoodsLabel);
		
		
		carbsFoodsLabel=new JLabel("Υδατανθράκων");
		carbsFoodsLabel.setFont(new Font("Calibri",Font.ITALIC, 20));
		carbsFoodsLabel.setBackground(null);
		carbsFoodsLabel.setBounds(170, 55, 200, 20);
		this.add(carbsFoodsLabel);*/
		
		if(myMacroType.equals("protein")) {
			//proteinFoodsLabel.setForeground(Color.white);
			//carbsFoodsLabel.setForeground(Color.GRAY);
			
			proteinMainMealsPanel=new ProteinBasedMainMeals("Κυρίως Γεύμα",myPatient);
			proteinMainMealsPanel.setLocation(2,270);
			
			proteinSnackPanel=new ProteinBasedSnacks("Σνακ",myPatient);
			proteinSnackPanel.setLocation(2,90);
			
			this.add(proteinSnackPanel);
			this.add(proteinMainMealsPanel);
			
			
		}
		else if(myMacroType.equals("carbs")) {
			//proteinFoodsLabel.setForeground(Color.GRAY);
			//carbsFoodsLabel.setForeground(Color.white);
			
			carbMainMealsPanel=new CarbBasedMainMeals("Κυρίως Γεύμα",myPatient);
			carbMainMealsPanel.setLocation(2,270);
			
			carbSnackPanel=new CarbBasedSnacks("Σνακ",myPatient);
			carbSnackPanel.setLocation(2,90);
			
			this.add(carbSnackPanel);
			this.add(carbMainMealsPanel);
		}
		
		
		
		
		
	}
	
	public FoodTypePanel getProteinSnackPanel() {
		return proteinSnackPanel;
	}
	public FoodTypePanel getProteinMainMealPanel() {
		return proteinMainMealsPanel;
	}
	public FoodTypePanel getCarbSnackPanel() {
		return carbSnackPanel;
	}
	public FoodTypePanel getCarbMainMealPanel() {
		return carbMainMealsPanel;
	}
}
