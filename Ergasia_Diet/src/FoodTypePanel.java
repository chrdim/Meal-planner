
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public abstract class FoodTypePanel extends JPanel{

	private TitledBorder myBorder;
	protected String myTitle;
	private Border whiteLine;
	protected Patient myPatient;
	protected ArrayList<Food>foods=new ArrayList<Food>();
	protected ArrayList<FoodCheckBox>foodCheckBoxes=new ArrayList<FoodCheckBox>();
	protected ArrayList<Food>checkedFoods=new ArrayList<Food>();
	
	
	public FoodTypePanel(String aTitle,Patient aPatient) {
		myPatient=aPatient;
		whiteLine=BorderFactory.createLineBorder(Color.white);
		myTitle=aTitle;
		myBorder=BorderFactory.createTitledBorder(whiteLine,myTitle);
		this.setBorder(myBorder);
		myBorder.setTitleJustification(TitledBorder.LEFT);
		myBorder.setTitleColor(Color.white);
		
		
		this.setSize(340,170);
		this.setVisible(true);
		this.setLayout(null);
		this.setBackground(null);
	}
	
	public abstract boolean examineCheckBoxes(); 
}
