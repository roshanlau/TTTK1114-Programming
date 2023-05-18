public class ABCMemberApp {
	public static void main(String[] args) {
		
		IT p1=new IT("Siti","Software Engineer",950.50);
		HR p2=new HR("Nabila","Manager",1500.00);	
		IT p3=new IT("Fattah","Senior Programmer",790.00);
		HR p4=new HR("Zul Ariffin","Executive",750.50);	
		
		ABCMember[] list = new ABCMember[4];
		list[0] = p1;
		list[1] = p2;
		list[2] = p3;
		list[3] = p4;
		
		for (int i=0; i<list.length; i++) {
			ABCMember member = list[i];
			if (member instanceof IT) {
				((IT) member).getSalary();
				((IT) member).printDetails();}
			else 
			if (member instanceof HR) {
				((HR) member).getSalary();
				((HR) member).printDetails();}
		}
	}
}
