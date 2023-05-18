import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;


public class DrinkGUI extends JFrame implements ListSelectionListener{
	private JPanel panel1;
	private JTextField selection;
	private JList choice;
	private JLabel selected;
	
	
	public DrinkGUI() {
		String drink[] = {"Caramel Choco", "Pepper Mint", "Tropical Candy", "Honey Bubble", "Vanila Orea", "Irish Cream", "Milk Tea"};
		Container pane = getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout());
		
		choice = new JList(drink);
		
		selected = new JLabel("Selected Drink >>>");
		
		selection = new JTextField("");
		
		panel1.add(selected);
		panel1.add(selection);
		
		pane.add(choice);
		pane.add(panel1);
		
		choice.addListSelectionListener(this);
	}
	
	public static void main(String[] args) {
		DrinkGUI frame = new DrinkGUI();
		frame.setTitle("**Lovely Drink**"); 
		frame.setSize(300, 200); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		selection.setText((String) choice.getSelectedValue());
	}


	

}
