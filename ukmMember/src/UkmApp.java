
public class UkmApp {
	public static void main(String[] args) {
		UkmMember[] person = {new Academic("K1487", "Azzalea", "lecturer"), new NonAcademic("K1294", "Aiman", "registrar"), new UnderGraduate("P1263", "Afreena", "Computer Science"), 
				new PostGraduate("P1723", "Mierza", "Object-Oriented Database Management System")};
		for(int i = 0; i < person.length; i++) {
			person[i].displayInfo();
			if(person[i] instanceof Staff) {
				 ((Staff) person[i]).displayPost();
			}else {
				((Student) person[i]).displayProgramme();
			}
		}
	}
}
