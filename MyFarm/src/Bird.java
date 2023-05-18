
public class Bird extends Animal{

	public Bird(String a) {
		super(a);
	}
	
	public void move() {
		super.move();
		System.out.println(super.animal_type+ " also can fly");
	}

}
