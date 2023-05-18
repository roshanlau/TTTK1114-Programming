import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class ArrTester extends JFrame implements ListSelectionListener {

    private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    private JList listH,listL;
    private JTextArea infoH,infoL;
    private JTabbedPane tabs;

    Border cyan = BorderFactory.createLineBorder(Color.cyan);
    Border black = BorderFactory.createLineBorder(Color.black);
    Border title = BorderFactory.createTitledBorder("Information");


    //static HighRankStaff [] test1 =  { new HighRankStaff("Mr.Alpha", "m145632", "Chief Executive Officer", 10000.00, "12"), new HighRankStaff("Mrs.Beta", "m323363", "Chief Financial Officer", 8000.00, "10")};

    //static LowRankStaff  [] test2 =  {  new TechDepartment("Mr.Gamma", "m153654", "Systems Administrator", 5000.00, "group5"), new SalesDepartment("Miss.Delta", "m182365", "Sales Consultant", 5000.00, 50000.00), new SalesDepartment("Miss.Epsilon", "m269854", "Sales Consultant", 5000.00, 15000.00)};

    static String [] high = new String [2];
    static String [] low = new String [3];

    public ArrTester() {

        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        listH = new JList(high);
        listH.setPreferredSize(new Dimension(200,200));
        listL = new JList(low);
        listL.setPreferredSize(new Dimension(200,200));

        tabs = new JTabbedPane();
        tabs.setBounds(50,50,400,300);

        infoH = new JTextArea();
        infoH.setEditable(false);
        infoH.setBackground(new Color (238,238,238));
        infoL = new JTextArea();
        infoL.setBackground(new Color (238,238,238));
        infoL.setEditable(false);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panel1.setBorder(black);
        panel1.setBackground(Color.white);
        panel1.add(listH);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panel2.setBorder(cyan);
        panel2.setBorder(title);
        panel2.add(infoH,BorderLayout.CENTER);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(panel1,BorderLayout.WEST);
        panel3.add(panel2,BorderLayout.CENTER);


        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panel4.setBorder(black);
        panel4.setBackground(Color.white);
        panel4.add(listL);

        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panel5.setBorder(cyan);
        panel5.setBorder(title);
        panel5.add(infoL,BorderLayout.CENTER);

        panel6 = new JPanel();
        panel6.setLayout(new BorderLayout());
        panel6.add(panel4,BorderLayout.WEST);
        panel6.add(panel5,BorderLayout.CENTER);

        tabs.add("Executive",panel3);
        tabs.add("Subordinate",panel6);


        pane.add(tabs);

        listH.addListSelectionListener(this);
        listL.addListSelectionListener(this);

    }

    public void valueChanged(ListSelectionEvent e) {
        String h = ((String)listH.getSelectedValue());
        String l = ((String)listL.getSelectedValue());

        if(tabs.getSelectedIndex()== 0) {
            listL.clearSelection();
            infoL.setText("");
            if(h.equals("Officer 1"))
                infoH.setText("Name               : Mr.Alpha\r\n"
                        + "ID                     : m145632\r\n"
                        + "Title                  : Chief Executive Officer\r\n"
                        + "Office Number : 12\r\n"
                        + "Office Colour   : Blue\r\n"
                        + "Salary               : RM 10000.00");

            if(h.equals("Officer 2"))
                infoH.setText("Name               : Mrs.Beta\r\n"
                        + "ID                     : m323363\r\n"
                        + "Title                  : Chief Financial Officer\r\n"
                        + "Office Number : 10\r\n"
                        + "Office Colour   : Green\r\n"
                        + "Salary               : RM 8000.00");
        }
        else {
            listH.clearSelection();
            infoH.setText("");
            if(l.equals("Staff 1"))
                infoL.setText("Name               : Mr.Gamma\r\n"
                        + "ID                     : m153654\r\n"
                        + "Title                 : Systems Administrator\r\n"
                        + "Table Number : 12\r\n"
                        + "Bonus             : RM 500.00\r\n"
                        + "Salary             : RM 5500.00\r\n"
                        + "Team Name   : group5");

            if(l.equals("Staff 2"))
                infoL.setText("Name              : Miss.Delta\r\n"
                        + "ID                    : m182365\r\n"
                        + "Title                 : Sales Consultant\r\n"
                        + "Table Number : 57\r\n"
                        + "Bonus             : RM 500.00\r\n"
                        + "Commission   : RM2500.00\r\n"
                        + "Salary              : RM 8000.00");

            if(l.equals("Staff 3"))
                infoL.setText("Name              : Miss.Epsilon\r\n"
                        + "ID                    : m269854\r\n"
                        + "Title                 : Sales Consultant\r\n"
                        + "Table Number : 73\r\n"
                        + "Bonus             : RM 500.00\r\n"
                        + "Commission   : RM 0.00\r\n"
                        + "Salary              : RM 5500.00");

        }
    }


    public static void main(String[] args) {

    	ArrTester frame = new ArrTester();
        frame.setTitle("Company Database");
        frame.setSize(480,360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        for(int i=0;i<high.length;i++) {
            String l = Integer.toString(i+1);
            high[i] = "Officer " + l;
        }

        for(int i=0;i<low.length;i++) {
            String l = Integer.toString(i+1);
            low[i] = "Staff " + l;
        }
    }
}
