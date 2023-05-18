import java.text.DecimalFormat;

class Staff{
   DecimalFormat df = new DecimalFormat("0.00");
   protected String staffName;
   protected String staffID;
   protected String title;
   protected Double salary;

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
