import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;



public class NextButton extends JButton{
	
	public NextButton()
	{
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 20));
		this.setText("Επόμενο");
		this.setForeground(Color.black);
		this.setBackground(null);
		this.setBorder(new LineBorder(new Color(128, 179, 229),1));
		this.setSize(500,500);
		this.setBounds(140, 650, 150, 30);
		
		
		
	}
	
	
}
