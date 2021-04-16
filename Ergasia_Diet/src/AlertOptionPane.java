import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlertOptionPane extends JOptionPane{

	private String type;
	private JFrame f;
	
	public AlertOptionPane(String aType) {
		f=new JFrame();
		type=aType;
		if(type.equals("emptyFields")) 
			this.showMessageDialog(f,"Θα πρέπει να συμπληρωθούν όλα τα πεδία.");
		
		else if(type.equals("heightProblem"))
			this.showMessageDialog(f, "Λανθασμένη καταχώρηση ύψους.");
		else if(type.equals("weightProblem"))
			this.showMessageDialog(f, "Λανθασμένη καταχώρηση βάρους");
		else if(type.equals("ageProblem"))
			this.showMessageDialog(f,"Λανθασμένη καταχώρηση ηλικίας");
		else if(type.equals("carbSnackProblem"))
			this.showMessageDialog(f,"Θα πρέπει να επιλέξετε τουλάχιστον 5 υδατανθρούκα σνακ.");
		else if(type.equals("carbMealProblem"))
			this.showMessageDialog(f,"Θα πρέπει να επιλέξετε τουλάχιστον 7 υδατανθρούκα κυρίως γεύματα.");
		else if(type.equals("proteinSnackProblem"))
			this.showMessageDialog(f,"Θα πρέπει να επιλέξετε τουλάχιστον 5 πρωτεινούχα σνακ.");
		else if(type.equals("proteinMealProblem"))
			this.showMessageDialog(f,"Θα πρέπει να επιλέξετε τουλάχιστον 7 πρωτεινούχα κυριώς γεύματα.");
		
		this.setVisible(true);
	}
	
}
