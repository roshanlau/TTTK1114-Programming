
public class Dog extends Animal{

	public Dog(String a) {
		super(a);
	}
	
	public void move() {
		super.move();
		System.out.println(super.animal_type+ " also can jump");
	}

}
