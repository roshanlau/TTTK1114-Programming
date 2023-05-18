
public class person {

	private String name;
	private int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "{" + "name='" + name + '\'' + ", age=" + age + '}';
				
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
