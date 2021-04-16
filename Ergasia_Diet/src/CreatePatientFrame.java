import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CreatePatientFrame extends JFrame{

	
	
	private Image titleBarIcon;
	private JPanel centralPanel;
	private JPanel containerFormPanel;
	private LabelCreatePatientForm patientNameLabel;
	private LabelCreatePatientForm patientAgeLabel;
	private LabelCreatePatientForm patientHeightLabel;
	private LabelCreatePatientForm patientWeightLabel;
	private LabelCreatePatientForm patientGenderLabel;
	private LabelCreatePatientForm patientActivityLabel;
	private LabelCreatePatientForm patientTargetLabel;
	private LabelCreatePatientForm patientRhythmLabel;
	//private JLabel background;
	//private ImageIcon backroundImage=new ImageIcon("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\backgroundImage.jpg");
	private JLabel personIconLabel;
	private ImageIcon addPersonIcon=new ImageIcon("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\addPerson.png");
	private JPanel personIconContainer;
	
	private TextFieldCreatePatientForm nameField;
	private TextFieldCreatePatientForm ageField;
	private TextFieldCreatePatientForm heightField;
	private TextFieldCreatePatientForm weightField;
	
	private GenderList genderList;
	
	private RadioButtonCreatePatientForm reductionRadioButton;
	private RadioButtonCreatePatientForm maintenanceRadioButton;
	private RadioButtonCreatePatientForm increaseRadioButton;
	
	
	private	ButtonGroup targetRadioButtonsGroup;
	
	
	private RadioButtonCreatePatientForm noActivityRadioButton;
	private RadioButtonCreatePatientForm lowActivityRadioButton;
	private RadioButtonCreatePatientForm mediumActivityRadioButton;
	private RadioButtonCreatePatientForm highActivityRadioButton;
	private RadioButtonCreatePatientForm athleteActivityRadioButton;
	
	private	ButtonGroup activityRadioButtonsGroup;
	
	
	private RadioButtonCreatePatientForm	rhythm1RadioButton;
	private RadioButtonCreatePatientForm 	rhythm2RadioButton;
	private RadioButtonCreatePatientForm 	rhythm3RadioButton;
	private RadioButtonCreatePatientForm 	rhythm4RadioButton;
	
	private	ButtonGroup	rhythmRadioButtonsGroup;
	
	private ProgressionPanel progressPanel;
	
	private NextButton nextButton;
	
	private JLabel cmLabel;
	private JLabel kgLabel;
	private JLabel perWeekLabel;
	private JLabel kgPerWeekLabel;
	
	
	public CreatePatientFrame() {
		
		
		containerFormPanel=new JPanel();
		containerFormPanel.setBackground( new Color(128, 179, 229) );
		
		
		containerFormPanel.setLayout(null);
		containerFormPanel.setSize(350, 450);
		containerFormPanel.setLocation(40,180);
		
		
		patientNameLabel=new LabelCreatePatientForm("Όνομα");
		patientAgeLabel=new LabelCreatePatientForm("Ηλικία");
		patientHeightLabel=new LabelCreatePatientForm("Ύψος");
		patientWeightLabel=new LabelCreatePatientForm("Βάρος");
		patientGenderLabel=new LabelCreatePatientForm("Φύλο");
		patientActivityLabel=new LabelCreatePatientForm("Δραστηριότητα");
		patientTargetLabel=new LabelCreatePatientForm("Στόχος");
		patientRhythmLabel=new LabelCreatePatientForm("Ρυθμός μεταβολής");
		
		cmLabel=new JLabel();
		cmLabel.setText("(σε cm)");
		cmLabel.setForeground(new Color(255, 255, 240));
		cmLabel.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		
		kgLabel=new JLabel();
		kgLabel.setText("(σε kg)");
		kgLabel.setForeground(new Color(255, 255, 240));
		kgLabel.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		
		perWeekLabel=new JLabel();
		perWeekLabel.setText("(φορές/εβδομάδα)");
		perWeekLabel.setForeground(new Color(255, 255, 240));
		perWeekLabel.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		
		kgPerWeekLabel=new JLabel();
		kgPerWeekLabel.setText("(κιλά/εβδομάδα)");
		kgPerWeekLabel.setForeground(new Color(255, 255, 240));
		kgPerWeekLabel.setFont(new Font("Calibri Light",Font.ITALIC, 15));
		
		containerFormPanel.add(patientNameLabel);
		containerFormPanel.add(patientAgeLabel);
		containerFormPanel.add(patientHeightLabel);
		containerFormPanel.add(patientWeightLabel);
		containerFormPanel.add(patientGenderLabel);
		containerFormPanel.add(patientActivityLabel);
		containerFormPanel.add(patientTargetLabel);
		containerFormPanel.add(patientRhythmLabel);
		
		containerFormPanel.add(cmLabel);
		containerFormPanel.add(kgLabel);
		containerFormPanel.add(perWeekLabel);
		containerFormPanel.add(kgPerWeekLabel);
		
		patientNameLabel.setBounds(10, 30, 100, 25);
		patientAgeLabel.setBounds(10, 70, 100, 25);
		patientHeightLabel.setBounds(10, 110, 100, 25);
		cmLabel.setBounds(61, 125, 50, 10);
		patientWeightLabel.setBounds(10, 150, 100, 25);
		kgLabel.setBounds(71, 160, 50, 15);
		patientGenderLabel.setBounds(10, 200, 100, 25);
		patientTargetLabel.setBounds(10, 240, 100, 25);
		patientActivityLabel.setBounds(10, 310, 200, 25);
		perWeekLabel.setBounds(161,317, 120, 20);
		patientRhythmLabel.setBounds(10, 370, 300, 25);
		kgPerWeekLabel.setBounds(200, 377, 120, 20);
		
		
		nameField=new TextFieldCreatePatientForm();
		ageField=new TextFieldCreatePatientForm();
		heightField=new TextFieldCreatePatientForm();
		weightField=new TextFieldCreatePatientForm();
		
		containerFormPanel.add(nameField);
		containerFormPanel.add(ageField);
		containerFormPanel.add(heightField);
		containerFormPanel.add(weightField);
		
		
		nameField.setBounds(150, 30, 130,25);
		ageField.setBounds(150, 70, 130,25);
		heightField.setBounds(150, 110, 130,25);
		weightField.setBounds(150, 150, 130,25);
		
		
		
		
		
		personIconContainer=new JPanel();
		personIconLabel=new JLabel();
		personIconLabel.setIcon(addPersonIcon);
		personIconContainer.add(personIconLabel);
		personIconContainer.setSize(120,100);
		personIconContainer.setLocation(5,100);
		personIconContainer.setBackground( new Color(0, 0, 0, 0) );
		
		
		
		genderList=new GenderList();
		containerFormPanel.add(genderList);
		genderList.setBounds(150, 190, 100, 40);
		
	
		
		reductionRadioButton=new RadioButtonCreatePatientForm("Μείωση");
		reductionRadioButton.setActionCommand("reduction");
		
		maintenanceRadioButton=new RadioButtonCreatePatientForm("Διατήρηση");
		maintenanceRadioButton.setActionCommand("maintenance");
		
		increaseRadioButton=new RadioButtonCreatePatientForm("Αύξηση");
		increaseRadioButton.setActionCommand("increase");
		
		
		containerFormPanel.add(reductionRadioButton);
		containerFormPanel.add(maintenanceRadioButton);
		containerFormPanel.add(increaseRadioButton);
		
		reductionRadioButton.setBounds(145, 240, 100, 25);
		maintenanceRadioButton.setBounds(145, 260, 100, 25);
		increaseRadioButton.setBounds(145, 280, 100, 25);
		
		targetRadioButtonsGroup=new ButtonGroup();
		targetRadioButtonsGroup.add(reductionRadioButton);
		targetRadioButtonsGroup.add(maintenanceRadioButton);
		targetRadioButtonsGroup.add(increaseRadioButton);
	
		
	
		noActivityRadioButton=new RadioButtonCreatePatientForm("0");
		noActivityRadioButton.setActionCommand("noActivity");
		lowActivityRadioButton=new RadioButtonCreatePatientForm("1-2");
		lowActivityRadioButton.setActionCommand("lowActivity");
		mediumActivityRadioButton=new RadioButtonCreatePatientForm("3-4");
		mediumActivityRadioButton.setActionCommand("mediumActivity");
		highActivityRadioButton=new RadioButtonCreatePatientForm("5-6");
		highActivityRadioButton.setActionCommand("highActivity");
		athleteActivityRadioButton=new RadioButtonCreatePatientForm("7");
		athleteActivityRadioButton.setActionCommand("athleteActivity");
		
		containerFormPanel.add(noActivityRadioButton);
		containerFormPanel.add(lowActivityRadioButton);
		containerFormPanel.add(mediumActivityRadioButton);
		containerFormPanel.add(highActivityRadioButton);
		containerFormPanel.add(athleteActivityRadioButton);
		
		noActivityRadioButton.setBounds(10, 340, 50, 25);
		lowActivityRadioButton.setBounds(60, 340, 50, 25);
		mediumActivityRadioButton.setBounds(120, 340, 50, 25);
		highActivityRadioButton.setBounds(180, 340, 50, 25);
		athleteActivityRadioButton.setBounds(240, 340, 50, 25);
		
		
		
		activityRadioButtonsGroup=new ButtonGroup();
		activityRadioButtonsGroup.add(noActivityRadioButton);
		activityRadioButtonsGroup.add(lowActivityRadioButton);
		activityRadioButtonsGroup.add(mediumActivityRadioButton);
		activityRadioButtonsGroup.add(highActivityRadioButton);
		activityRadioButtonsGroup.add(athleteActivityRadioButton);
		
		
		rhythm1RadioButton=new RadioButtonCreatePatientForm("0.5");
		rhythm1RadioButton.setActionCommand("0.5");
		rhythm2RadioButton=new RadioButtonCreatePatientForm("1");
		rhythm2RadioButton.setActionCommand("1");
		rhythm3RadioButton=new RadioButtonCreatePatientForm("1.5");
		rhythm3RadioButton.setActionCommand("1.5");
		rhythm4RadioButton=new RadioButtonCreatePatientForm("2");
		rhythm4RadioButton.setActionCommand("2");
		
		
		containerFormPanel.add(rhythm1RadioButton);
		containerFormPanel.add(rhythm2RadioButton);
		containerFormPanel.add(rhythm3RadioButton);
		containerFormPanel.add(rhythm4RadioButton);
	
		
		rhythm1RadioButton.setBounds(10, 395, 50, 25);
		rhythm2RadioButton.setBounds(60, 395, 50, 25);
		rhythm3RadioButton.setBounds(110, 395, 50, 25);
		rhythm4RadioButton.setBounds(170, 395, 50, 25);
	
		
		
		
		rhythmRadioButtonsGroup=new ButtonGroup();
		rhythmRadioButtonsGroup.add(rhythm1RadioButton);
		rhythmRadioButtonsGroup.add(rhythm2RadioButton);
		rhythmRadioButtonsGroup.add(rhythm3RadioButton);
		rhythmRadioButtonsGroup.add(rhythm4RadioButton);
		
		
		
		progressPanel=new ProgressionPanel(1);
		progressPanel.setLocation(45,20);
		
		nextButton=new NextButton();
		
		centralPanel=new JPanel();
		
		
		
		
		
		centralPanel.setLayout(null);
		
		centralPanel.add(progressPanel);
		centralPanel.add(personIconContainer);
		centralPanel.add(containerFormPanel);
		centralPanel.add(nextButton);
		
		
		
	
		
		centralPanel.setBackground(Color.white);
		
		
		
		
	
		this.setContentPane(centralPanel);
		
		
		
		
		titleBarIcon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\xrist\\OneDrive\\Υπολογιστής\\DietImages\\FormIcon.png");    
		this.setIconImage(titleBarIcon);  
		this.setResizable(false);
		this.setLocation(500,50);
		this.setVisible(true);
		this.setSize(450,750);
		this.setTitle("Εισαγωγή δεδομένων πελάτη");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	nextButton.setBackground( new Color(128, 179, 229));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	nextButton.setBackground(null);
		    }
		});
		
			
		nextButton.addActionListener(new ActionListener() 
		
		{
			
		    public void actionPerformed(ActionEvent e) {
		    
		    	
		    	if((!(nameField.getText().trim().isEmpty() || ageField.getText().trim().isEmpty() || heightField.getText().trim().isEmpty() || weightField.getText().trim().isEmpty() || (targetRadioButtonsGroup.getSelection() == null) ||activityRadioButtonsGroup.getSelection()==null||genderList.getSelectedValue()==null || rhythmRadioButtonsGroup.getSelection()==null))) {
		    		if(weightField.getText().matches("-?\\d+(\\.\\d+)?")){
		    			if(heightField.getText().matches("-?\\d+(\\.\\d+)?")){
		    				if(ageField.getText().matches("-?\\d+(\\.\\d+)?")){
		    				
		    					String name=nameField.getText();
					
					
		    					double age=Double.parseDouble(ageField.getText());
					
					
					
		    					double height=Double.parseDouble(heightField.getText());
					
		    					double weight=Double.parseDouble(weightField.getText());
		    					String  target=targetRadioButtonsGroup.getSelection().getActionCommand();
		    					
		    					String activityLevel=activityRadioButtonsGroup.getSelection().getActionCommand();
					
		    					String gender=genderList.getSelectedValue().toString();
					
					
		    					Double rhythm=Double.parseDouble(rhythmRadioButtonsGroup.getSelection().getActionCommand());
					
					
					
		    					if(age>10 && age<99) {
		    						if(height>50 && height<250) {
		    							if(weight>20 && weight<300) {
								
					
		    								Patient myPatient=new Patient(name,age,height,weight,gender,activityLevel,target);
				
				
		    								System.out.println(rhythm);
				
		    								//myPatient.printInfo();
				
		    								if(target.equals("reduction")){
		    									Reduction myReduction=new Reduction(myPatient,rhythm);
		    									new FoodChoicesFrame(myPatient,myReduction);
		    									closeFrame();
		    								}else if(target.equals("increase")) {
		    									Increase myIncrease=new Increase(myPatient,rhythm);
		    									new FoodChoicesFrame(myPatient,myIncrease);
		    									closeFrame();
		    								}else if(target.equals("maintenance")) {
		    									Maintenance myMaintenance=new Maintenance(myPatient);
		    									new FoodChoicesFrame(myPatient,myMaintenance);
		    									closeFrame();
		    								}
		    							}else {
		    								new AlertOptionPane("weightProblem");
		    							}
		    						}else {
		    							new AlertOptionPane("heightProblem");
		    						}
		    					}
		    					else {
						
		    						new AlertOptionPane("ageProblem");
		    					}
		    				}
		    				else {
		    					new AlertOptionPane("ageProblem");
		    					}
		    			}else {
		    				new AlertOptionPane("heightProblem");
		    			}
		    		}else {
		    			new AlertOptionPane("weightProblem");
		    		}
		    	}
				else {
					new AlertOptionPane("emptyFields");
					
				}
		   }
		    
		});
	
	}
	
	private void closeFrame() {
		this.setVisible(false);
	}
	
}
