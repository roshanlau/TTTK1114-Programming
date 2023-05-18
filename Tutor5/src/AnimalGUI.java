import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalGUI extends JFrame implements ActionListener{
	private JPanel panel1;
	private JLabel quesDisplay;
	private JLabel ansDisplay;
	private JLabel userAns;
	private JRadioButton cat;
	private JRadioButton bird;
	private JRadioButton fish;
	private String animal;

	public AnimalGUI() {
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(0, 1));
		
		ButtonGroup gp = new ButtonGroup();
		Counter frame = new Counter(); 
		panel1 = new JPanel();
		
		cat = new JRadioButton("Cat");
		bird = new JRadioButton("Bird");
		fish = new JRadioButton("fish");
		
		gp.add(cat);
		gp.add(bird);
		gp.add(fish);
		
		panel1.setLayout(new GridLayout(0, 1));
		panel1.add(cat);
		panel1.add(bird);
		panel1.add(fish);
		
		cat.addActionListener(this);
		bird.addActionListener(this);
		fish.addActionListener(this);
		
		quesDisplay = new JLabel("Which Animal can fly?");
		ansDisplay = new JLabel("You have selected:");
		userAns = new JLabel("");
		
		pane.add(quesDisplay);
		pane.add(panel1);
		pane.add(ansDisplay);
		pane.add(userAns);
	}

	public static void main(String[] args) {
		AnimalGUI frame = new AnimalGUI();
		frame.setTitle("Simple Quiz"); 
		frame.setSize(350, 200); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(cat.isSelected()) {
			animal = "Cat";
		}else if(bird.isSelected()) {
			animal = "Bird";
		}else {
			animal = "Fish";
		}
		
		if(animal == "Bird") {
			userAns.setText(animal + " can fly. Excellent.");
		}else {
			userAns.setText(animal + " can't fly. Try Again.");
		}
	}

}