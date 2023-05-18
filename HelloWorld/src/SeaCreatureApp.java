//Class SeaCreature 
class SeaCreature { 
	public void method1() { 
		System.out.println("creature 1"); } 
	public void method2() { 
		System.out.println("creature 2"); } 
	public String toString() { 
		return "ocean dwelling"; 
	} 
} 
// Class Mammal 
class Mammal extends SeaCreature { 
	public void method1() { System.out.println("warm blooded"); } 
} 
// Class Whale 
class Whale extends Mammal { 
	public void method1() { 
		System.out.println("spout"); } 
	public String toString() { 
		return "BIG!"; 
	} 
} 
// Class Squid 
class Squid extends SeaCreature { 
	public void method2() { 
		System.out.println("tentacles"); } 
	public String toString() { 
		return "squid"; 
	}
}
//Class SeaCreatureApp 
public class SeaCreatureApp { 
	public static void main (String []args){ 
		SeaCreature[] elements = {new Squid(), new 
				Whale(), new SeaCreature(),new Mammal()}; 
		for (int i = 0; i < elements.length; i++) { 
			System.out.println(elements[i]); elements[i].method1(); elements[i].method2(); 
			System.out.println(); 
		}
	}
}