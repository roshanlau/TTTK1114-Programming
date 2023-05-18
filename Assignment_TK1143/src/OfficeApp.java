import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.EventQueue;
import java.awt.Font;

public class OfficeApp extends JFrame {

    static String Namesend;
    static String IDsend;
    static Double Salarysend;
    static String Titlesend;
    static Double Salessend;
    static String OfficeNosend;
    static String popup;
    static String TeamNamesend;
    static HighRankStaff test1;
    static LowRankStaff test2;
    //For office Gui
    ArrayList<String> nameArr = new ArrayList<String>();
    ArrayList<String> IDArr = new ArrayList<String>();
    ArrayList<Double> salaryArr = new ArrayList<Double>();
    ArrayList<String> titleArr = new ArrayList<String>();
    ArrayList<Double> salesArr = new ArrayList<Double>();
    ArrayList<String> officeNoArr = new ArrayList<String>();
    ArrayList<String> teamNameArr = new ArrayList<String>();

  //CONSTRUCTOR
    public OfficeApp() {
        initComponents();
    }

    //@SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new JLabel();
        Name = new JLabel();
        NameText = new JTextField();
        ID = new JLabel();
        IDText = new JTextField();
        Salary = new JLabel();
        SalaryText = new JTextField();
        Title = new JLabel();
        TitleBox = new JComboBox<>();
        OfficeNoSalesTeamName = new JComboBox<>();
        SalesText = new JTextField();
        SubmitBtn = new JButton();
        PrintOfficeButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office Management System");

        jLabel1.setFont(new Font("sansserif", 1, 14)); 
        jLabel1.setText("Office Management System");

        //ACTIONLISTENERS AND KEYLISTENERS
        //Textfield for name
        Name.setText("Name");
        NameText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
            }
        }
        );
        NameText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                NameTextKeyPressed(evt);
            }
        }
        );

        //TextField for ID
        ID.setText("ID");
        IDText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        }
        );
        IDText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                IDTextKeyPressed(evt);      
            }
        }
        );

        //TextField for Salary
        Salary.setText("Salary (RM)");
        SalaryText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             
            }
        }
        );
        SalaryText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SalaryTextKeyPressed(evt);      
            }
        }
        );

        //CheckBox for Titles
        Title.setText("Title");
        TitleBox.setModel(new DefaultComboBoxModel<>(new String[] {"--SELECT--" ,"Chief Executive Officer", "Chief Financial Officer", "System Administrator", "Sales Consultant" }));
        TitleBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TitleBoxActionPerformed(evt);
            }
        }
        );
        
        //CheckBox for selecting OfficeNo/Total Sales/Team Name based on their titles
        OfficeNoSalesTeamName.setEditable(false);
        OfficeNoSalesTeamName.setModel(new DefaultComboBoxModel<>(new String[] { "--SELECT--","Office No.", "Team Name", "Total Sales" }));
        OfficeNoSalesTeamName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OfficeNoSalesTeamNameActionPerformed(evt);
            }
        }
        );

        //TextField for Sales
        SalesText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SalesTextActionPerformed(evt);
            }
        }
        );
        SalesText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SalesTextKeyPressed(evt);      
            }
        }
        );

        //Button for Submit
        SubmitBtn.setText("SUBMIT");
        SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        }
        );

        //Button to Print Office
        PrintOfficeButton.setText("SHOW OFFICE");
        PrintOfficeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	PrintOfficeBtnActionPerformed(evt);
            }
        }
        );
        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(SubmitBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(Name, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Salary, GroupLayout.Alignment.LEADING))
                                                        .addComponent(Title, GroupLayout.PREFERRED_SIZE, 41,GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(OfficeNoSalesTeamName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(NameText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(IDText)
                                                        .addComponent(SalaryText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(SalesText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                        .addComponent(TitleBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel1)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameText, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ID)
                                        .addComponent(IDText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(SalaryText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Salary))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Title)
                                        .addComponent(TitleBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(OfficeNoSalesTeamName, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SalesText, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(SubmitBtn)
                                .addGap(27, 27, 27))
        );
        pack();
    }
    
    private void PrintOffice() {
    	 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setTitle("OfficeGUI");
         
         
         
    }

    
    private void NameTextActionPerformed(ActionEvent evt) {
        
    }
    
    //To adjust the cursor focus to next Text Field
    public void NameTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                IDText.requestFocus();
    }
    

    private void SubmitBtnActionPerformed(ActionEvent evt) {
        
        
        
        if (evt.getSource()==SubmitBtn){
         
                Namesend=NameText.getText();
                IDsend= IDText.getText();
                Salarysend=Double.parseDouble(SalaryText.getText());
                
                if (OfficeNoSalesTeamName.getSelectedIndex()==1){
            
                    OfficeNosend=SalesText.getText();
                }
                else if(OfficeNoSalesTeamName.getSelectedIndex()==2){
                    TeamNamesend=SalesText.getText();
                }
                else if (OfficeNoSalesTeamName.getSelectedIndex()==3){
                    Salessend=Double.parseDouble(SalesText.getText());
                }
                
                Titlesend=String.valueOf(TitleBox.getSelectedItem());
            
        //ERROR MESSAGE
             if(TitleBox.getSelectedIndex()==0){
                 JOptionPane.showMessageDialog(null, "Please select your Title","Error", JOptionPane.ERROR_MESSAGE);
             }
             
             if(OfficeNoSalesTeamName.getSelectedIndex()==0){
                 JOptionPane.showMessageDialog(null, "Please select your OfficeNo/Sales/TeamName","Error", JOptionPane.ERROR_MESSAGE);
             }
        ///
            
            
            if(TitleBox.getSelectedIndex()==1 || TitleBox.getSelectedIndex()==2){
            	//for office gui
            	nameArr.add(Namesend);
            	IDArr.add(IDsend);
            	titleArr.add(Titlesend);
            	salaryArr.add(Salarysend);
            	officeNoArr.add(OfficeNosend);
            	teamNameArr.add(null);
            	salesArr.add(null);
            	
                HighRankStaff  test1 = new HighRankStaff(Namesend, IDsend , Titlesend, Salarysend, OfficeNosend);
                test1.displayInfo();
                System.out.println();
            }

            else if (TitleBox.getSelectedIndex()==3){
            	//for office gui
            	nameArr.add(Namesend);
            	IDArr.add(IDsend);
            	titleArr.add(Titlesend);
            	salaryArr.add(Salarysend);
            	officeNoArr.add(null);
            	teamNameArr.add(TeamNamesend);
            	salesArr.add(null);
            	
                LowRankStaff test2 = new TechDepartment(Namesend, IDsend, Titlesend, Salarysend, TeamNamesend);
                test2.displayInfo();
                System.out.println();
            }

            else if (TitleBox.getSelectedIndex()==4){
            	//for office gui
            	nameArr.add(Namesend);
            	IDArr.add(IDsend);
            	titleArr.add(Titlesend);
            	salaryArr.add(Salarysend);
            	officeNoArr.add(null);
            	teamNameArr.add(null);
            	salesArr.add(Salessend);
            	
                test2 = new SalesDepartment(Namesend, IDsend, Titlesend, Salarysend, Salessend);
                test2.displayInfo();
                System.out.println();
            }
        }
    }

    private void PrintOfficeBtnActionPerformed(ActionEvent evt) {
    	if (evt.getSource() == PrintOfficeButton) {
    		PrintOffice();
    	}
    }
    
    private void IDTextActionPerformed(ActionEvent evt) {
        
    }

     public void IDTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalaryText.requestFocus();
    }
     
     
    private void SalaryTextActionPerformed(ActionEvent evt) {                                           

    }
    
     public void SalaryTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalesText.requestFocus();
    }

     
    private void SalesTextActionPerformed(ActionEvent evt) {                                          

        
    }
    
    public void SalesTextKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                    NameText.requestFocus();
    }
    
    
    
    public void TitleBoxKeyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                SalaryText.requestFocus();
    }

    
    private void TitleBoxActionPerformed(ActionEvent evt) {                                       
    }

    
    private void OfficeNoSalesTeamNameActionPerformed(ActionEvent evt) {                                                      

        OfficeNoSalesTeamName.setEnabled(true);
        if (TitleBox.getSelectedIndex() == 1 || TitleBox.getSelectedIndex() == 2) {
            OfficeNoSalesTeamName.setSelectedIndex(1);
        } else if (TitleBox.getSelectedIndex() == 3) {
            OfficeNoSalesTeamName.setSelectedIndex(2);
        } else if (TitleBox.getSelectedIndex() == 4) {
            OfficeNoSalesTeamName.setSelectedIndex(3);
        }
    }

    
    
    // Variables declaration 
    private JLabel ID;
    private JTextField IDText;
    private JLabel Name;
    private JTextField NameText;
    private JComboBox<String> OfficeNoSalesTeamName;
    private JLabel Salary;
    private JTextField SalaryText;
    private JTextField SalesText;
    private JButton SubmitBtn, PrintOfficeButton;
    private JLabel Title;
    private JComboBox<String> TitleBox;
    private JLabel jLabel1;
    
    // Office Gui Variable declaration
    private JList staffList;
    private JLabel HighRankOffice;
    


    public static void main(String args[]) {
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficeApp().setVisible(true);
            }
        }
        );
    }
}




class Staff extends OfficeApp{
    public String staffName;
    public String staffID;
    public String title;
    public Double salary;

    DecimalFormat df = new DecimalFormat("0.00");
    
    public Staff(String staffName,String staffID,String title,Double salary){
        this.staffName=staffName;
        this.staffID=staffID;
        this.title=title;
        this.salary=salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void displayInfo(){
        System.out.println("Name   : " + staffName) ;
        System.out.println("ID     : " + staffID);
        System.out.println("Title  : " + title);
    }
}




class HighRankStaff extends Staff{
    public String officeNo;
    public String OfficeColour;

    public HighRankStaff(String staffName, String staffID, String title,Double salary, String officeNo){
        super(staffName,staffID,title,salary);
        this.officeNo=officeNo;
    }

    public void setOfficeColour() {
        String []color= {"Gray","Pastel Yellow","Light Blue","Brown","Orange"};
        //CHOOSE RANDOM COLOUR FROM THE ARRAY
        int temp=(int)Math.floor(Math.random()*(4-0+1)+0);
        OfficeColour=color[temp];
        System.out.println("Office Colour : " + OfficeColour);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Number : " + officeNo);
        setOfficeColour();
        System.out.println("Salary : " + "RM " +  df.format(salary));
    }
}



class LowRankStaff extends Staff{
    public Double bonus;

    public LowRankStaff(String staffName, String staffID, String title,Double salary){
        super(staffName,staffID,title,salary);
    }

   
    public void setBonus() {
        bonus = (salary*0.1);
        System.out.println("Bonus : " + "RM " + df.format(bonus));
    }

    @Override
    public Double getSalary() {
        return (bonus+salary);
    }

    public void setOfficeTableNo() {
        System.out.println("Table Number : " + (int)Math.floor(Math.random()*(100-1+1)+1));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        setOfficeTableNo();
        setBonus();
    }
}


class SalesDepartment extends LowRankStaff {
    public Double sales ;
    public Double commission=0.00;

    public SalesDepartment(String staffName, String staffID, String title, Double salary, Double sales) {
        super(staffName, staffID, title, salary);
        this.sales = sales;
    }

    //Staffs from Sales Department receives 5% commission from their total monthly Sales. ONLY IF THEY HIT THEIR SALES TARGET (RM20000)
    public void calcCommission() {
        if (sales >= 20000) {
            commission = (sales * 0.05);
            System.out.println("Commission : " + "RM" + df.format(commission));
        } else {
            System.out.println("Commission : " + "RM 0.00");
        }
    }

    @Override
    public Double getSalary() {
        return bonus + commission + salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        calcCommission();
        System.out.println("Salary : " + "RM " + df.format(getSalary()));
    }
}

class TechDepartment extends LowRankStaff{
    public String teamName;

    public TechDepartment(String staffName, String staffID, String title, Double salary, String teamName){
        super(staffName,staffID,title,salary);
        this.teamName=teamName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary : " + "RM " + df.format(getSalary()));
        System.out.println("Team Name : " + teamName);
    }
}
