
public class Duck extends Bird{

	public Duck(String a) {
		super(a);
	}
	
	public void move() {
		super.move();
		System.out.println(super.animal_type+ " also can swim");
	}

}
