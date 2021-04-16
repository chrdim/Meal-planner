import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class RadioButtonCreatePatientForm extends JRadioButton{

	private String text;
	
	public RadioButtonCreatePatientForm(String aText) {
	text=aText;
	
	this.setVisible(true);
	this.setFont(new Font("Calibri Light",Font.ITALIC, 15));
	this.setForeground(new Color(255, 255, 240));
	this.setBackground(null);
	this.setSize(500,500);
	this.setText(text);
	}
}

