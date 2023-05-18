import javax.swing.*; 
import java.awt.*;  

public class CheckBox extends JFrame { 
	private JCheckBox java, c, python; 
	public CheckBox() 
	{ 
		Container pane = getContentPane(); 
		pane.setLayout(new FlowLayout()); 
		java = new JCheckBox("Java"); 
		c = new JCheckBox("C++"); 
		python = new JCheckBox("Python"); 
		pane.add(java); 
		pane.add(c); 
		pane.add(python); 
	}
	public static void main(String [] args) { 
		CheckBox frame = new CheckBox(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Programming"); 
		frame.setSize(300, 100);  
		frame.setVisible(true); 
	}
}