import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener{ 
	private JPanel panel1;
	private JLabel tDisplay;
	private JButton btnAdd, btnMinus;
	
	public Counter() { 
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2, 1));
		tDisplay = new JLabel("0");
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout());
		btnAdd = new JButton("Add");
		btnMinus = new JButton("Minus");
		panel1.add(btnAdd);
		panel1.add(btnMinus);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		
		pane.add(tDisplay, 0, 0);
		pane.add(panel1, 0, 1);
		
	}
	public static void main (String[] args) { 
		Counter frame = new Counter(); 
		frame.setTitle("Counter"); 
		frame.setSize(300, 200); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		int count = Integer.parseInt(tDisplay.getText());
		
		if(obj == btnAdd) {
			count += 2;
			tDisplay.setText(count + "");
		}else {
			count -= 1;
			tDisplay.setText(count + "");
		}
		
	}
}