import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class DietPlanButton extends JButton{
	
	private String text;
	
	public DietPlanButton(String aText) {
		
		text=aText;
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		this.setText(text);
		this.setForeground(Color.black);
		this.setBackground(null);
		this.setBorder(new LineBorder(Color.black,1));
		this.setSize(20,20);
		
		
	}

}
