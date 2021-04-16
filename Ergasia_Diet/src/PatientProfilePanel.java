import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PatientProfilePanel extends JPanel{

	private Target myTarget;
	private Patient myPatient;
	
	private JLabel panelTitle=new JLabel("Στοιχεία Πελάτη");
	
	private PatientProfileLabel nameLabel=new PatientProfileLabel("Όνομα");
	private PatientProfileLabel patientNameLabel;
	private PatientProfileLabel ageLabel=new PatientProfileLabel("Ηλικία");
	private PatientProfileLabel patientAgeLabel;
	private PatientProfileLabel heightLabel=new PatientProfileLabel("Ύψος");
	private PatientProfileLabel patientHeightLabel;
	private PatientProfileLabel weightLabel=new PatientProfileLabel("Βάρος");
	private PatientProfileLabel patientWeightLabel;
	private PatientProfileLabel genderLabel=new PatientProfileLabel("Φύλο");
	private PatientProfileLabel patientGenderLabel;
	private PatientProfileLabel targetLabel=new PatientProfileLabel("Στόχος");
	private PatientProfileLabel patientTargetLabel;
	private PatientProfileLabel rhythmLabel=new PatientProfileLabel("Ρυθμός μεταβολής");
	private PatientProfileLabel patientRhythmLabel;
	private PatientProfileLabel activityLabel=new PatientProfileLabel("Δραστηριότητα");
	private PatientProfileLabel patientActivityLabel;
	private PatientProfileLabel caloriesLabel=new PatientProfileLabel("Θερμίδες");
	private PatientProfileLabel patientCaloriesLabel;
	private PatientProfileLabel proteinLabel=new PatientProfileLabel("Πρωτείνη");
	private PatientProfileLabel patientProteinLabel;
	private PatientProfileLabel carbLabel=new PatientProfileLabel("Υδατάθρακας");
	private PatientProfileLabel patientCarbLabel;
	private PatientProfileLabel fatLabel=new PatientProfileLabel("Λιπαρά");
	private PatientProfileLabel patientFatLabel;
	
	
	
	
	
	public PatientProfilePanel(Patient aPatient,Target aTarget) {
		
		myTarget=aTarget;
		myPatient=aPatient;
		
		
		panelTitle.setFont(new Font("Calibri Light",Font.ITALIC, 23));
		panelTitle.setForeground(new Color(255, 255, 240));
		panelTitle.setBackground(null);
		
		patientNameLabel=new PatientProfileLabel(myPatient.getName());
		patientAgeLabel=new  PatientProfileLabel(String.valueOf(myPatient.getAge()));
		patientHeightLabel=new PatientProfileLabel(String.valueOf(myPatient.getHeight()+" cm"));
		patientWeightLabel=new PatientProfileLabel(String.valueOf(myPatient.getWeight()+" kg"));
		patientGenderLabel=new PatientProfileLabel(myPatient.getGender());
		
		
		String target=myPatient.getTarget();
		if(target.equals("reduction")) {
			patientTargetLabel=new PatientProfileLabel("Μείωση κιλών");
			patientRhythmLabel=new PatientProfileLabel(String.valueOf(myTarget.getRhythm())+" κιλά/εβδομάδα");
		}
		else if(target.equals("maintenance")) {
			patientTargetLabel=new PatientProfileLabel("Συντήρηση κιλών");
			patientRhythmLabel=new PatientProfileLabel("0"+" κιλά/εβδομάδα");
		}
		else if(target.equals("increase")) {
			patientTargetLabel=new PatientProfileLabel("Αύξηση κιλών");
			patientRhythmLabel=new PatientProfileLabel(String.valueOf(myTarget.getRhythm())+" κιλά/εβδομάδα");
		}
		
	
		
		
		
		
		
	
		String activity=(myPatient.getActivityLevel());
		if(activity.equals("noActivity"))
			patientActivityLabel=new PatientProfileLabel("0 φορές/εβδομάδα");
		else if(activity.equals("lowActivity"))
			patientActivityLabel=new PatientProfileLabel("1-2 φορές/εβδομάδα");
		else if(activity.equals("mediumActivity"))
			patientActivityLabel=new PatientProfileLabel("3-4 φορές/εβδομάδα");
		else if(activity.equals("highActivity"))
			patientActivityLabel=new PatientProfileLabel("5-6 φορές/εβδομάδα");
		else if(activity.equals("athleteActivity"))
			patientActivityLabel=new PatientProfileLabel("7 φορές/εβδομάδα");
		
		
		
		
		
		patientCaloriesLabel=new PatientProfileLabel(String.valueOf((int)Math.round (myTarget.getCalories())+" cal ανά ημέρα"));
		patientProteinLabel=new PatientProfileLabel(String.valueOf(myTarget.getProteinsKiloGramms()+" gr ανά ημέρα"));
		patientCarbLabel=new PatientProfileLabel(String.valueOf(myTarget.getCarbsKiloGramms()+" gr ανά ημέρα"));
		patientFatLabel=new PatientProfileLabel(String.valueOf(myTarget.getFatsKiloGramms()+" gr ανά ημέρα"));
		
		this.add(panelTitle);
		this.add(nameLabel);
		this.add(patientNameLabel);	
		this.add(ageLabel);
		this.add(patientAgeLabel);
		this.add(heightLabel);
		this.add(patientHeightLabel);
		this.add(weightLabel);
		this.add(patientWeightLabel);
		this.add(genderLabel);
		this.add(patientGenderLabel);
		this.add(targetLabel);
		this.add(patientTargetLabel);	
		this.add(rhythmLabel);
		this.add(patientRhythmLabel);
		this.add(activityLabel);
		this.add(patientActivityLabel);
		this.add(caloriesLabel);
		this.add(patientCaloriesLabel);
		this.add(proteinLabel);
		this.add(patientProteinLabel);
		this.add(patientCarbLabel);
		this.add(carbLabel);
		this.add(patientFatLabel);
		this.add(fatLabel);
		
		panelTitle.setBounds(100, 15, 500, 20);
		
		nameLabel.setBounds(20, 40, 200, 20);
		patientNameLabel.setBounds(100, 40, 200, 20);
		ageLabel.setBounds(20, 70, 200, 20);
		patientAgeLabel.setBounds(100, 70, 200, 20);
		heightLabel.setBounds(20, 100, 200, 20);
		patientHeightLabel.setBounds(100, 100, 200, 20);
		weightLabel.setBounds(20, 130, 200, 20);
		patientWeightLabel.setBounds(100, 130, 200, 20);
		
		genderLabel.setBounds(20, 160, 200, 20);
		patientGenderLabel.setBounds(100, 160, 200, 20);
		targetLabel.setBounds(20, 190, 200, 20);
		patientTargetLabel.setBounds(100, 190, 200, 20);
		rhythmLabel.setBounds(20, 220, 200, 20);
		patientRhythmLabel.setBounds(150, 220, 200, 20);
		activityLabel.setBounds(20, 250, 200, 20);
		patientActivityLabel.setBounds(140, 250, 200, 20);
		
		caloriesLabel.setBounds(20, 280, 200, 20);
		patientCaloriesLabel.setBounds(100, 280, 200, 20);
		proteinLabel.setBounds(20, 310, 200, 20);
		patientProteinLabel.setBounds(100, 310, 200, 20);
		carbLabel.setBounds(20, 340, 200, 20);
		patientCarbLabel.setBounds(120, 340, 200, 20);
		fatLabel.setBounds(20, 370, 200, 20);
		patientFatLabel.setBounds(100, 370, 200, 20);
		
		
		
		
		
		
		this.setBackground(new Color(128, 179, 229));
		this.setLayout(null);
		this.setSize(325,400);
		this.setLocation(10,50);
		
	}
	
}
