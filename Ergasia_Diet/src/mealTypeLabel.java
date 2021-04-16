import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class mealTypeLabel extends JLabel{
	
	private String text;
	
	public mealTypeLabel(String aText) {
		
		text=aText;
		this.setText(text);
		
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 20));
		this.setForeground(new Color(255, 255, 240));
		this.setBackground(null);
		
		if(text.equals("Πρωινό")) {
			this.setBounds(10,  50, 200,20);
		}else if(text.equals("Σνακ 1")) {
			this.setBounds(10,  120, 200,20);
		}else if(text.equals("Μεσημεριανό")) {
			this.setBounds(10,  190, 200,20);
		}else if(text.equals("Σνακ 2")) {
			this.setBounds(10,  260, 200,20);
		}else if(text.equals("Βραδινό")) {
			this.setBounds(10,  330, 200,20);
		}
	}

}
