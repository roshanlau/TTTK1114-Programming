class LowRankStaff extends Staff{
   public Double bonus;
   public String OfficeTableNo;
   
   public LowRankStaff(String staffName, String staffID, String title,double salary, String OfficeTableNo){
       super(staffName,staffID,title,salary);
       this.OfficeTableNo=OfficeTableNo;
   }

   //LowRankStaffs receive total bonus of 10% from their salary
   public void setBonus() {
       bonus = (salary*0.1);
       System.out.println("Bonus : " + "RM " + df.format(bonus));
   }


   @Override
   public Double getSalary() {
       return (bonus+salary);
   }

 
   public void setOfficeTableNo() {
       System.out.println("Table Number : " + OfficeTableNo);

   }

   @Override
   public void displayInfo() {
       super.displayInfo();
       setOfficeTableNo();
       setBonus();
   }
}
