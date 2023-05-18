import java.util.*;

public class PersonApp {
	public static void main(String[] args) {
		List<person> persons = new ArrayList<>(Arrays.asList(
												new person("Mierza", 19),
												new person("Irdina", 20),
												new person("Sharon", 24),
												new person("Muaz", 20),
												new person("Bulya", 18)
												));
		Collections.sort(persons, new Comparator<person>() {
			public int compare(person p1, person p2) {
				System.out.println(p1.getAge() - p2.getAge());
				return p1.getAge() - p2.getAge();
			}
		});
		
		System.out.println(persons);
	}
}
