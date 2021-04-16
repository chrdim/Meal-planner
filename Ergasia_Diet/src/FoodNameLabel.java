import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class FoodNameLabel extends JLabel {

	
	
	public FoodNameLabel(String aText) {
		
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 25));
		this.setForeground(new Color(255, 255, 240));
		this.setBackground(null);
	}
}
