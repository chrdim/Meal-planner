import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlertOptionPane extends JOptionPane{

	private String type;
	private JFrame f;
	
	public AlertOptionPane(String aType) {
		f=new JFrame();
		type=aType;
		if(type.equals("emptyFields")) 
			this.showMessageDialog(f,"�� ������ �� ������������ ��� �� �����.");
		
		else if(type.equals("heightProblem"))
			this.showMessageDialog(f, "���������� ���������� �����.");
		else if(type.equals("weightProblem"))
			this.showMessageDialog(f, "���������� ���������� ������");
		else if(type.equals("ageProblem"))
			this.showMessageDialog(f,"���������� ���������� �������");
		else if(type.equals("carbSnackProblem"))
			this.showMessageDialog(f,"�� ������ �� ��������� ����������� 5 ������������ ����.");
		else if(type.equals("carbMealProblem"))
			this.showMessageDialog(f,"�� ������ �� ��������� ����������� 7 ������������ ������ �������.");
		else if(type.equals("proteinSnackProblem"))
			this.showMessageDialog(f,"�� ������ �� ��������� ����������� 5 ����������� ����.");
		else if(type.equals("proteinMealProblem"))
			this.showMessageDialog(f,"�� ������ �� ��������� ����������� 7 ����������� ������ �������.");
		
		this.setVisible(true);
	}
	
}
