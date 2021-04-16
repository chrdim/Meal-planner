import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class FoodNQuantitiesLabel extends JLabel{
	
	String text;
	
	public FoodNQuantitiesLabel(String aText) {
	text=aText;
	this.setText(text);
	this.setVisible(true);
	this.setFont(new Font("Calibri Light",Font.ITALIC, 14));
	this.setForeground(Color.white);
	this.setBackground(null);
	}
}
