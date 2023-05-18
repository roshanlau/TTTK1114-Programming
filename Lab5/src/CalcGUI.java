import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcGUI extends JFrame implements ActionListener{
	private JLabel lengthDis;
	private JLabel widthDis;
	private JLabel areaDis;
	private JTextField lengthAns, widthAns;
	private JPanel panel1;
	private int ans;
	
	public CalcGUI() {
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(0, 1));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 1));
	
		lengthDis = new JLabel("Enter the length: ");
		widthDis = new JLabel("Enter the width: ");
		areaDis = new JLabel("Area of Rectangle: ");
		
		lengthAns = new JTextField();
		widthAns = new JTextField();
		
		lengthAns.addActionListener(this);
		widthAns.addActionListener(this);
		
		panel1.add(lengthDis);
		panel1.add(lengthAns);
		panel1.add(widthDis);
		panel1.add(widthAns);
		
		pane.add(panel1);
		pane.add(areaDis);
		
		
	}

	public static void main(String[] args) {
		CalcGUI frame = new CalcGUI();
		frame.setTitle("Rectangle"); 
		frame.setSize(300, 100); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		int num1 = Integer.parseInt(lengthAns.getText());
		int num2 = Integer.parseInt(widthAns.getText());
		
		ans = num1 * num2;
		
		areaDis.setText("Area of Rectangle: " + ans);
	}

}
