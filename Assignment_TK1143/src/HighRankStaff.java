class HighRankStaff extends Staff{
   private String officeNo;
   private String OfficeColour;

   public HighRankStaff(String staffName, String staffID, String title,Double salary, String officeNo){
       super(staffName,staffID,title,salary);
       this.officeNo=officeNo;
   }

  
   public void setOfficeColour() {

       if (officeNo=="12"){
           OfficeColour="Blue";
       }
       else if (officeNo=="10"){
           OfficeColour="Green";
       }
       else {
           OfficeColour = "White";
       }

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
