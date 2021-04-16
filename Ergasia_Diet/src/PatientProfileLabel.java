import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class PatientProfileLabel extends JLabel{
	
	private String text;
	
	public PatientProfileLabel(String aText) {
		text=aText;
		
		this.setText(text);
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		this.setForeground(Color.white);
		this.setBackground(null);
		
	}

}
