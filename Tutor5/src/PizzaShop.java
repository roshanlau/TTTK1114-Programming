import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PizzaShop extends JFrame implements ActionListener, ListSelectionListener{
	private JLabel header1, header2, name_header, size_label, crust_label, topping_label, message;
	private JTextField cus_name;
	private JCheckBox pepperoni, sausage, mushroom, cheese, onion, pepper;
	private JPanel header_panel, cusName_panel, size_panel, crust_panel, topping_panel, test, topping_panel1, panel1, 
	button_panel, blank_space, bottom_panel;
	private JList size_list, crust_list;
	private JButton order_button, reset_button;
	
	private int amt, amt1, amt2;
	private String msg = "";
	
	public PizzaShop() {
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		header_panel = new JPanel();
		header_panel.setLayout(new GridLayout(0, 1));
		cusName_panel = new JPanel();
		cusName_panel.setLayout(new GridLayout(1, 0));
		size_panel = new JPanel();
		size_panel.setLayout(new GridLayout(0, 1));
		crust_panel = new JPanel();
		crust_panel.setLayout(new GridLayout(0, 1));
		test = new JPanel();
		test.setLayout(new GridLayout(1, 0));
		topping_panel = new JPanel();
		topping_panel.setLayout(new GridLayout(3, 2));
		topping_panel1 = new JPanel();
		topping_panel1.setLayout(new GridLayout(0, 1));
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 0));
		button_panel = new JPanel();
		blank_space = new JPanel();
		bottom_panel = new JPanel();
		bottom_panel.setLayout(new GridLayout(0, 1));

		order_button = new JButton("Order");
		reset_button = new JButton("Reset");
		button_panel.add(order_button);
		button_panel.add(reset_button);

		order_button.addActionListener(this);
		reset_button.addActionListener(this);

		message = new JLabel("", SwingConstants.CENTER);

		String pizza_size[] = {"Small(RM3)", "Regular(RM5)", "Large(RM7)", "Xtra Large(RM9)"};
		String pizza_crust[] = {"Classic(RM2)", "Crunchy Thin(RM3)", "Stuffed(RM4)", "Cheese Burst(RM5)"};
		size_list = new JList(pizza_size);
		crust_list = new JList(pizza_crust);
		size_label = new JLabel("Size:", SwingConstants.CENTER);
		crust_label = new JLabel("Crust:", SwingConstants.CENTER);

		size_list.addListSelectionListener(this);
		crust_list.addListSelectionListener(this);

		size_panel.add(size_label);
		size_panel.add(size_list);
		crust_panel.add(crust_label);
		crust_panel.add(crust_list);

		test.add(size_panel);
		test.add(crust_panel);

		topping_label = new JLabel("Topping(RM1 each):", SwingConstants.CENTER);

		pepperoni = new JCheckBox("Pepperoni");
		sausage = new JCheckBox("Sausage");
		mushroom = new JCheckBox("Mushroom");
		cheese = new JCheckBox("Cheese");
		onion = new JCheckBox("Onion");
		pepper = new JCheckBox("Pepper");

		pepperoni.addActionListener(this);
		sausage.addActionListener(this);
		mushroom.addActionListener(this);
		cheese.addActionListener(this);
		onion.addActionListener(this);
		pepper.addActionListener(this);

		topping_panel.add(pepperoni);
		topping_panel.add(sausage);
		topping_panel.add(mushroom);
		topping_panel.add(cheese);
		topping_panel.add(onion);
		topping_panel.add(pepper);

		topping_panel1.add(topping_label);
		topping_panel1.add(topping_panel);

		panel1.add(test);
		panel1.add(topping_panel1);


		header1 = new JLabel("Cheap & Tasty (Limited 1 customer = 1 pizza)", SwingConstants.CENTER);
		header2 = new JLabel("***********************************", SwingConstants.CENTER);
		name_header = new JLabel("Customer Name: ", SwingConstants.CENTER);
		cus_name = new JTextField("", SwingConstants.CENTER);
		cusName_panel.add(name_header);
		cusName_panel.add(cus_name);

		cus_name.addActionListener(this);

		header_panel.add(header1);
		header_panel.add(header2);
		header_panel.add(cusName_panel);

		bottom_panel.add(button_panel);
		bottom_panel.add(message);

		pane.add(header_panel, BorderLayout.NORTH);
		pane.add(panel1, BorderLayout.CENTER);
		pane.add(blank_space, BorderLayout.EAST);
		pane.add(blank_space, BorderLayout.WEST);
		pane.add(bottom_panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		PizzaShop frame = new PizzaShop();
		frame.setTitle("Create Your Own Pizza"); 
		frame.setSize(500, 350); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true); 		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat df = new DecimalFormat("0.00");
		amt = 0;
		if (e.getSource() == reset_button) {
			pepperoni.setSelected(false);
			sausage.setSelected(false);
			mushroom.setSelected(false);
			cheese.setSelected(false);
			onion.setSelected(false);
			pepper.setSelected(false);
			size_list.clearSelection(); 
			crust_list.clearSelection(); 
			cus_name.setText("");
			message.setText("");
		}
		if (pepperoni.isSelected()) {
			amt+=1;
		}
		if (sausage.isSelected()) {
			amt+=1;
		}
		if (mushroom.isSelected()) {
			amt+=1;
		}
		if (cheese.isSelected()) {
			amt+=1;
		}
		if (onion.isSelected()) {
			amt+=1;
		}
		if (pepper.isSelected()) {
			amt+=1;
		}
		
		if (e.getSource() == order_button) {
			message.setText(msg);
		}
		
		
		
		if(msg.equals("Please complete the form. TQ")){
			msg = "Please complete the form. TQ";
		}else {
			msg = "Hi " + cus_name.getText() + ". Your total order is RM" + df.format(amt+amt1) + ". Thank you.";
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		amt1 = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		if(crust_list.getSelectedIndex() == 0) {
			amt1 += 2;
		}else if(crust_list.getSelectedIndex() == 1) {
			amt1 += 3;
		}else if(crust_list.getSelectedIndex() == 2) {
			amt1 += 4;
		}else if(crust_list.getSelectedIndex() == 3) {
			amt1 += 5;
		}
		
		if(size_list.getSelectedIndex() == 0) {
			amt1 += 3;
		}else if(size_list.getSelectedIndex() == 1) {
			amt1 += 5;
		}else if(size_list.getSelectedIndex() == 2) {
			amt1 += 7;
		}else if(size_list.getSelectedIndex() == 3) {
			amt1 += 9;
		}
		
			
		
		if(crust_list.getSelectedIndex() == -1 || size_list.getSelectedIndex() == -1) {
			msg = "Please complete the form. TQ";
		}else {
			msg = "Hi " + cus_name.getText() + ". Your total order is RM" + df.format(amt+amt1) + ". Thank you.";
		}
		
		
		
	}



}
