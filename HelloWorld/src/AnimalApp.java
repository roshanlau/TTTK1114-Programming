public class AnimalApp{ 
	public static void main(String[] args){ 
		Animal[] a = {new Animal("Animal"),new Dog("Dog"),new Cat("Cat"), 
				new Lion("Lion")}; 
		for(int x=0 ; x<a.length; x++) { 
			a[x].eat();} 
	}

} 
class Animal{
	protected String animal_type; 
	public Animal(String type) { 
		animal_type=type; 
	}
	void eat(){ 
		System.out.println(animal_type + " eating...");
	} 
} 
class Dog extends Animal{ 
	public Dog(String type) {
		super(type);
	}
	
	void eat(){
		System.out.println(animal_type + " eating bone...");
	}
}
class Cat extends Animal{ 
	public Cat(String type) {
		super(type);
	}

	void eat(){System.out.println(animal_type + " eating fish...");
	}
}
class Lion extends Animal{
	public Lion(String type) {
		super(type);
	}

	void eat(){System.out.println(animal_type + " eating meat...");
	} 
}