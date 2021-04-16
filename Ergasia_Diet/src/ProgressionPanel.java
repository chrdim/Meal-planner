import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgressionPanel extends JPanel{

	private int numberOfCurrentForm;
	private ProgressBarPanel oneTOtwo;
	private ProgressBarPanel twoTOthree;
	private NumberOfFormPanel firstForm;
	private NumberOfFormPanel secondForm;
	private NumberOfFormPanel thirdForm;
	private TaskLabel firstTaskLabel; 
	private TaskLabel secondTaskLabel; 
	private TaskLabel thirdTaskLabel; 
	
	
	public ProgressionPanel(int anInt) {
		numberOfCurrentForm=anInt;
		
		oneTOtwo=new ProgressBarPanel();
		twoTOthree=new ProgressBarPanel();
		
		firstForm=new NumberOfFormPanel("1");
		firstForm.numberLabel.setForeground(Color.WHITE);
		secondForm=new NumberOfFormPanel("2");
		thirdForm=new NumberOfFormPanel("3");
		
		firstTaskLabel=new TaskLabel("Δεδομένα πελάτη");
		secondTaskLabel=new TaskLabel("Διατροφικές προτιμήσεις πελάτη");
		thirdTaskLabel=new TaskLabel("Εμφάνιση διαιτολογίου");
		
		if(numberOfCurrentForm==1) {
			oneTOtwo.setBackground(Color.GRAY);
			twoTOthree.setBackground(Color.GRAY);
			
			firstForm.setBackground( new Color(128, 179, 229));
			secondForm.setBackground(Color.GRAY);
			thirdForm.setBackground(Color.GRAY);
		
		}else if(numberOfCurrentForm==2) {
			oneTOtwo.setBackground( new Color(128, 179, 229));
			twoTOthree.setBackground(Color.GRAY);
			secondForm.numberLabel.setForeground(Color.WHITE);
			
			firstForm.setBackground( new Color(128, 179, 229));
			secondForm.setBackground( new Color(128, 179, 229));
			thirdForm.setBackground(Color.GRAY);
			
		}else if(numberOfCurrentForm==3) {
			oneTOtwo.setBackground( new Color(128, 179, 229));
			twoTOthree.setBackground( new Color(128, 179, 229));
			secondForm.numberLabel.setForeground(Color.WHITE);
			thirdForm.numberLabel.setForeground(Color.WHITE);
			firstForm.setBackground( new Color(128, 179, 229));
			secondForm.setBackground( new Color(128, 179, 229));
			thirdForm.setBackground( new Color(128, 179, 229));
		}
		
		
		
		this.add(firstForm);
		this.add(oneTOtwo);
		this.add(secondForm);
		this.add(twoTOthree);
		this.add(thirdForm);
		this.add(firstTaskLabel);
		this.add(secondTaskLabel);
		this.add(thirdTaskLabel);
		
		firstForm.setBounds(10, 10, 25, 25);
		firstTaskLabel.setBounds(0, 30, 200, 25);
		oneTOtwo.setBounds(30, 22, 120, 2);
		secondForm.setBounds(150, 10, 25, 25);
		secondTaskLabel.setBounds(100, 30, 200, 25);
		twoTOthree.setBounds(170, 22, 120, 2);
		thirdForm.setBounds(290, 10, 25, 25);
		thirdTaskLabel.setBounds(250, 30, 200, 25);
		
		this.setLayout(null);
		this.setBackground(null);
		this.setSize(500,85);
		
	}
	
	
	
	public class ProgressBarPanel extends JPanel{
		
		public ProgressBarPanel() {
			this.setSize(200, 12);
			
			
		}
		
	}
	
	public class NumberOfFormPanel extends JPanel{
		private String number;
		private JLabel numberLabel;
		public NumberOfFormPanel(String aNumber) {
			number=aNumber;
			this.setSize(30, 30);
			numberLabel=new JLabel();
			numberLabel.setText(number);
			numberLabel.setForeground(Color.BLACK);
			numberLabel.setFont(new Font("Calibri Light",Font.ITALIC, 17));
			this.add(numberLabel);
			
		}
		
	}
	
	class TaskLabel extends JLabel{
		private String text;
		
		public TaskLabel(String aText){
			text=aText;
		
			this.setVisible(true);
			this.setFont(new Font("Calibri Light",Font.ITALIC, 10));
			this.setText(text);
			this.setForeground(Color.black);
			this.setBackground(null);
			
		}
	}
}
