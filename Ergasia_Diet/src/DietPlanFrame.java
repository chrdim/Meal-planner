import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DietPlanFrame extends JFrame{
	
	private Target myTarget;
	private Patient myPatient;
	private ProgressionPanel progressPanel;
	private Image titleBarIcon;
	private JPanel centralPanel;
	private JPanel dietContainerPanel;
	
	private DietPlanButton mondayButton=new DietPlanButton("Δ");
	private DietPlanButton tuesdayButton=new DietPlanButton("Τ");
	private DietPlanButton wednesdayButton=new DietPlanButton("Τ");
	private DietPlanButton thursdayButton=new DietPlanButton("Π");
	private DietPlanButton fridayButton=new DietPlanButton("Π");
	private DietPlanButton saturdayButton=new DietPlanButton("Σ");
	private DietPlanButton sundayButton=new DietPlanButton("Κ");
	private DietPlanButton patientInfoButton=new DietPlanButton("i");
	
	private JPanel linePanel=new JPanel();
	
	private DayDietPanel mondayDietPanel;
	private DayDietPanel tuesdayDietPanel;
	private DayDietPanel wednesdayDietPanel;
	private DayDietPanel thursdayDietPanel;
	private DayDietPanel fridayDietPanel;
	private DayDietPanel saturdayDietPanel;
	private DayDietPanel sundayDietPanel;
	
	private PatientProfilePanel patientProfile;
	
	private ArrayList<Day>programm=new ArrayList<Day>();
	
	private JLabel dietIconLabel;
	private ImageIcon dietIcon=new ImageIcon("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\dietIcon.png");
	private JPanel dietIconContainer;
	
	public DietPlanFrame(Patient aPatient,Target aTarget) {
		myPatient=aPatient;
		myTarget=aTarget;
		
		for(int i=0;i<7;i++) {
			programm.add(new Day(myPatient,myTarget));
		}
		
		mondayDietPanel=new DayDietPanel("Δευτέρα",programm.get(0),myPatient);
		tuesdayDietPanel=new DayDietPanel("Τρίτη",programm.get(1),myPatient);
		wednesdayDietPanel=new DayDietPanel("Τετάρτη",programm.get(2),myPatient);
		thursdayDietPanel=new DayDietPanel("Πέμπτη",programm.get(3),myPatient);
		fridayDietPanel=new DayDietPanel("Παρασκευή",programm.get(4),myPatient);
		saturdayDietPanel=new DayDietPanel("Σάββατο",programm.get(5),myPatient);
		sundayDietPanel=new DayDietPanel("Κυριακή",programm.get(6),myPatient);
		
		dietContainerPanel=new JPanel();
		dietContainerPanel.setBackground( new Color(128, 179, 229) );
		dietContainerPanel.setLayout(null);
		dietContainerPanel.setSize(350, 450);
		dietContainerPanel.setLocation(40,180);
		
		
		dietContainerPanel.add(mondayButton);
		dietContainerPanel.add(tuesdayButton);
		dietContainerPanel.add(wednesdayButton);
		dietContainerPanel.add(thursdayButton);
		dietContainerPanel.add(fridayButton);
		dietContainerPanel.add(saturdayButton);
		dietContainerPanel.add(sundayButton);
		dietContainerPanel.add(patientInfoButton);
		
		mondayButton.setBounds(12, 30, 20, 20);
		tuesdayButton.setBounds(56, 30, 20, 20);
		wednesdayButton.setBounds(99, 30, 20, 20);
		thursdayButton.setBounds(142, 30, 20, 20);
		fridayButton.setBounds(184, 30, 20, 20);
		saturdayButton.setBounds(226, 30, 20, 20);
		sundayButton.setBounds(268, 30, 20, 20);
		patientInfoButton.setBounds(310, 30, 20, 20);
		
		
		linePanel.setBackground(Color.white);
		dietContainerPanel.add(linePanel);
		linePanel.setBounds(0,55, 350, 1);
		
		patientProfile=new PatientProfilePanel(myPatient,myTarget);
		
		dietIconContainer=new JPanel();
		dietIconLabel=new JLabel();
		dietIconLabel.setIcon(dietIcon);
		dietIconContainer.add(dietIconLabel);
		dietIconContainer.setSize(120,110);
		dietIconContainer.setLocation(2,95);
		dietIconContainer.setBackground( new Color(0, 0, 0, 0) );
		
		
		dietContainerPanel.add(mondayDietPanel);
		dietContainerPanel.add(tuesdayDietPanel);
		dietContainerPanel.add(wednesdayDietPanel);
		dietContainerPanel.add(thursdayDietPanel);
		dietContainerPanel.add(fridayDietPanel);
		dietContainerPanel.add(saturdayDietPanel);
		dietContainerPanel.add(sundayDietPanel);
		dietContainerPanel.add(patientProfile);
		

		patientInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	patientInfoButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	patientInfoButton.setBackground(null);
		    }
		});
		
		mondayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	mondayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	mondayButton.setBackground(null);
		    }
		});
		
		tuesdayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	tuesdayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	tuesdayButton.setBackground(null);
		    }
		});
		
		wednesdayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	wednesdayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	wednesdayButton.setBackground(null);
		    }
		});
		
		thursdayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	thursdayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	thursdayButton.setBackground(null);
		    }
		});
		
		saturdayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	saturdayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	saturdayButton.setBackground(null);
		    }
		});
		
		fridayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	fridayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	fridayButton.setBackground(null);
		    }
		});
		
		sundayButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	sundayButton.setBackground( Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	sundayButton.setBackground(null);
		    }
		});
		
		
		
		
		
		
		
		
		patientInfoButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
			 mondayDietPanel.setVisible(false);
			 tuesdayDietPanel.setVisible(false);
			 wednesdayDietPanel.setVisible(false);
			 thursdayDietPanel.setVisible(false);
			 fridayDietPanel.setVisible(false);
			 saturdayDietPanel.setVisible(false);
			 sundayDietPanel.setVisible(false);
			 patientProfile.setVisible(true);
			
			}
		 });
		
		
		mondayButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
			 mondayDietPanel.setVisible(true);
			 tuesdayDietPanel.setVisible(false);
			 wednesdayDietPanel.setVisible(false);
			 thursdayDietPanel.setVisible(false);
			 fridayDietPanel.setVisible(false);
			 saturdayDietPanel.setVisible(false);
			 sundayDietPanel.setVisible(false);
			 patientProfile.setVisible(false);
			
			}
		 });
			
		tuesdayButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
			 mondayDietPanel.setVisible(false);
			 tuesdayDietPanel.setVisible(true);
			 wednesdayDietPanel.setVisible(false);
			 thursdayDietPanel.setVisible(false);
			 fridayDietPanel.setVisible(false);
			 saturdayDietPanel.setVisible(false);
			 sundayDietPanel.setVisible(false);
			 patientProfile.setVisible(false);
			
			}
		 });
	
		 wednesdayButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
			 mondayDietPanel.setVisible(false);
			 tuesdayDietPanel.setVisible(false);
			 wednesdayDietPanel.setVisible(true);
			 thursdayDietPanel.setVisible(false);
			 fridayDietPanel.setVisible(false);
			 saturdayDietPanel.setVisible(false);
			 sundayDietPanel.setVisible(false);
			 patientProfile.setVisible(false);
			
			}
		 });
		 
		 thursdayButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					
				 mondayDietPanel.setVisible(false);
				 tuesdayDietPanel.setVisible(false);
				 wednesdayDietPanel.setVisible(false);
				 thursdayDietPanel.setVisible(true);
				 fridayDietPanel.setVisible(false);
				 saturdayDietPanel.setVisible(false);
				 sundayDietPanel.setVisible(false);
				 patientProfile.setVisible(false);
				
				}
			 });
		 
		 fridayButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					
				 mondayDietPanel.setVisible(false);
				 tuesdayDietPanel.setVisible(false);
				 wednesdayDietPanel.setVisible(false);
				 thursdayDietPanel.setVisible(false);
				 fridayDietPanel.setVisible(true);
				 saturdayDietPanel.setVisible(false);
				 sundayDietPanel.setVisible(false);
				 patientProfile.setVisible(false);
				
				}
			 });
		 
		 saturdayButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					
				 mondayDietPanel.setVisible(false);
				 tuesdayDietPanel.setVisible(false);
				 wednesdayDietPanel.setVisible(false);
				 thursdayDietPanel.setVisible(false);
				 fridayDietPanel.setVisible(false);
				 saturdayDietPanel.setVisible(true);
				 sundayDietPanel.setVisible(false);
				 patientProfile.setVisible(false);
				
				}
			 });
		 
		 sundayButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					
				 mondayDietPanel.setVisible(false);
				 tuesdayDietPanel.setVisible(false);
				 wednesdayDietPanel.setVisible(false);
				 thursdayDietPanel.setVisible(false);
				 fridayDietPanel.setVisible(false);
				 saturdayDietPanel.setVisible(false);
				 sundayDietPanel.setVisible(true);
				 patientProfile.setVisible(false);
				
				}
			 });
		
		
		
		
		
		
		
		progressPanel=new ProgressionPanel(3);
		progressPanel.setLocation(45,20);
		
		centralPanel=new JPanel();
		centralPanel.setLayout(null);
		centralPanel.add(dietIconContainer);
		centralPanel.add(progressPanel);
		centralPanel.add(dietContainerPanel);
		
		centralPanel.setBackground(Color.white);
		this.setContentPane(centralPanel);
		
		
		titleBarIcon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\FormIcon.png");    
		this.setIconImage(titleBarIcon);  
		this.setResizable(false);
		this.setLocation(500,50);
		this.setVisible(true);
		this.setSize(450,750);
		this.setTitle("Πλάνο Διατροφής");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
