import java.awt.*;
import javax.swing.*;

public class MyLayout extends JFrame{
	private JButton b1, b2, b3, b4, b5;
		
	public MyLayout(){
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		b1 = new JButton("One");
		b2 = new JButton("Two");
		b3 = new JButton("Three");
		b4 = new JButton("Four");
		b5 = new JButton("Five");
		
		pane.add(b1 );
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);
		pane.add(b5);
	}
	
	public static void main(String[] args) {
		MyLayout frame = new MyLayout(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("My Layout"); 
		frame.setSize(300, 200);  
		frame.setVisible(true); 
	}
}
