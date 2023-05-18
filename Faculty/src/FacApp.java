import java.util.*;

public class FacApp {

	public static void main(String[] args) {
		String detail = null;
		int basic = 0, DA = 0, medAllowance = 0, otherAllowance = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		
		basic = sc.nextInt();
		DA = sc.nextInt();
		
		switch(n) {
			case 1:			
				AssistantProfessor test = new AssistantProfessor(name, basic, DA);
				detail = test.getDetails();
				break;
			case 2:								
				medAllowance = sc.nextInt();
				AssociateProfessor test2 = new AssociateProfessor(name, basic, DA, medAllowance);
				detail = test2.getDetails();
				break;
			case 3:							
				medAllowance = sc.nextInt();
				otherAllowance = sc.nextInt();
				Professor test3 = new Professor(name, basic, DA, medAllowance, otherAllowance);
				detail = test3.getDetails();
				break;
		}
		System.out.println(detail);
	}

}
