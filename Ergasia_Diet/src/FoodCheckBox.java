import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;

public class FoodCheckBox extends JCheckBox{
	
	private String text;
	public FoodCheckBox(String aText) {
		
		this.setSize(50,50);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		this.setForeground(Color.white);
		this.setBackground(null);
		this.setText(aText);
		
	}
	


}
