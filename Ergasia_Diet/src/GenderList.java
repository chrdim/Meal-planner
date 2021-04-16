import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.border.LineBorder;

public class GenderList extends JList{

	
	
	public GenderList() {
		DefaultListModel model=new DefaultListModel();
		
		model.addElement("’ντρας");
		model.addElement("Γυναίκα");
		this.setModel(model);
		
		this.setVisible(true);
		this.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		this.setForeground(new Color(255, 255, 240));
		this.setBackground(null);
		
		
	}
}
