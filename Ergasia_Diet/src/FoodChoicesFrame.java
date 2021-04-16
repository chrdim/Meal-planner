import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class FoodChoicesFrame extends JFrame{
	
	private ProgressionPanel progressPanel;
	private Image titleBarIcon;
	private JPanel centralPanel;
	private TypeOfMacroSourceFood proteinBasedFoodsPanel;
	private TypeOfMacroSourceFood carbBasedFoodsPanel;
	
	private JLabel proteinFoodsLabel;
	private JLabel carbsFoodsLabel;
	
	private NextButton nextButton=new NextButton();
	
	private Patient myPatient;
	private Target myTarget;
	
	private JLabel foodIconLabel;
	private ImageIcon foodIcon=new ImageIcon("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\foodIcon.png");
	private JPanel foodIconContainer;
	
	public FoodChoicesFrame(Patient aPatient,Target aTarget) {
		
	
		myPatient=aPatient;
		myTarget=aTarget;
		
		proteinBasedFoodsPanel=new TypeOfMacroSourceFood("protein",myPatient);
		carbBasedFoodsPanel=new TypeOfMacroSourceFood("carbs",myPatient);
		
		proteinFoodsLabel=new JLabel("Πρωτείνης");
		proteinFoodsLabel.setFont(new Font("Calibri",Font.ITALIC, 20));
		proteinFoodsLabel.setBackground(null);
		proteinFoodsLabel.setBounds(80, 230, 200, 20);
		proteinFoodsLabel.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		      
		      proteinBasedFoodsPanel.setVisible(true);
		      carbBasedFoodsPanel.setVisible(false);
		      proteinFoodsLabel.setForeground(Color.white);
		      carbsFoodsLabel.setForeground(Color.GRAY);

		    }  
		}); 
		
		
		
		carbsFoodsLabel=new JLabel("Υδατανθράκων");
		carbsFoodsLabel.setFont(new Font("Calibri",Font.ITALIC, 20));
		carbsFoodsLabel.setBackground(null);
		carbsFoodsLabel.setBounds(220, 230,200, 20);
		carbsFoodsLabel.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		      
		      proteinBasedFoodsPanel.setVisible(false);
		      carbBasedFoodsPanel.setVisible(true);
		      proteinFoodsLabel.setForeground(Color.GRAY);
		      carbsFoodsLabel.setForeground(Color.white);

		    }  
		}); 
	
		
		proteinFoodsLabel.setForeground(Color.white);
		carbsFoodsLabel.setForeground(Color.GRAY);
	
		
		progressPanel=new ProgressionPanel(2);
		progressPanel.setLocation(45,20);
		
		foodIconContainer=new JPanel();
		foodIconLabel=new JLabel();
		foodIconLabel.setIcon(foodIcon);
		foodIconContainer.add(foodIconLabel);
		foodIconContainer.setSize(120,110);
		foodIconContainer.setLocation(5,100);
		foodIconContainer.setBackground( new Color(0, 0, 0, 0) );
		
		

		centralPanel=new JPanel();
		centralPanel.setLayout(null);
		centralPanel.add(progressPanel);
		centralPanel.add(foodIconContainer);
		centralPanel.add(carbsFoodsLabel);
		centralPanel.add(proteinFoodsLabel);
		centralPanel.add(proteinBasedFoodsPanel);
		centralPanel.add(carbBasedFoodsPanel);
		
		centralPanel.add(nextButton);
		nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	nextButton.setBackground( new Color(128, 179, 229));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	nextButton.setBackground(null);
		    }
		});
		
		
		
		
		
		
		
		centralPanel.setBackground(Color.white);
		this.setContentPane(centralPanel);
		
		titleBarIcon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\FormIcon.png");    
		this.setIconImage(titleBarIcon);  
		this.setResizable(false);
		this.setLocation(500,50);
		this.setVisible(true);
		this.setSize(450,750);
		this.setTitle("Διατροφικές προτιμήσεις πελάτη");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		nextButton.addActionListener(new ActionListener(){
			
		    public void actionPerformed(ActionEvent e) {
		    
		    	
		    	
		    		if(proteinBasedFoodsPanel.getProteinSnackPanel().examineCheckBoxes()==true) {
		    			if(proteinBasedFoodsPanel.getProteinMainMealPanel().examineCheckBoxes()==true) {
		    				if(carbBasedFoodsPanel.getCarbSnackPanel().examineCheckBoxes()==true) {
		    					if(carbBasedFoodsPanel.getCarbMainMealPanel().examineCheckBoxes()==true) {
		    				
		    						//myPatient.printFood();
		    						new DietPlanFrame(myPatient,myTarget);
		    						closeFrame();
		    						
		    				
		    					}else {
		    						new AlertOptionPane("carbMealProblem");
		    						myPatient.getProteinPreferences().clear();
		    						myPatient.getCarbsPreferences().clear();
		    						
		    					}
		    					
		    				}else {
		    					new AlertOptionPane("carbSnackProblem");
		    					myPatient.getProteinPreferences().clear();
	    						myPatient.getCarbsPreferences().clear();
		    					
		    				}
		    			}else {
		    				new AlertOptionPane("proteinMealProblem");
		    				myPatient.getProteinPreferences().clear();
    						myPatient.getCarbsPreferences().clear();
		    				
		    			}
		    		}else {
		    				
		    				new AlertOptionPane("proteinSnackProblem");
		    				myPatient.getProteinPreferences().clear();
    						myPatient.getCarbsPreferences().clear();
		    				
		    		}
		    	
		    	
				
		    		}
		    	
		    
		});
		
		
	}
	private void closeFrame() {
		this.setVisible(false);
	}

}
