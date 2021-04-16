import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.*;


public class LabelCreatePatientForm extends JLabel{

	private String text;
	public LabelCreatePatientForm(String aText) {
		
		text=aText;
		
			
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 25));
		this.setText(text);
		this.setForeground(new Color(255, 255, 240));
		this.setBackground(null);
	}
	
}
