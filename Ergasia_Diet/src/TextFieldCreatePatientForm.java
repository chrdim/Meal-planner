import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class TextFieldCreatePatientForm extends JTextField{
	
	
	
	public TextFieldCreatePatientForm() {
	
	this.setVisible(true);
	this.setFont(new Font("Calibri Light",Font.ITALIC, 20));
	this.setForeground(new Color(255, 255, 240));
	this.setBackground(null);
	this.setBorder(new LineBorder(new Color(255, 255, 240),1));
	this.setSize(500,500);
	
	}

}
