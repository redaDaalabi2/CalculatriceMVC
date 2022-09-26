//The listener interface for receiving action events.
import java.awt.event.ActionListener;

//Swing fait partie de la bibliothèque Java Foundation Classes JFC
import javax.swing.*;

//JFrame est une classe qui se trouve dans swing qui permet de créer une frame
//JPanel est un conteneur qui peut stocker et organiser un groupe de composants 
public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(15);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(15);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(15);
	
	CalculatorView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 100);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}
	
	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}
	
	public void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
}