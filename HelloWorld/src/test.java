import java.util.*;

public class test {

	public static void main(String[] args) {
		String[] states = {"NY", "CA", "MI", "FL"};
		  ArrayList list = new
		  ArrayList(Arrays.asList(states));
		  ListIterator it = list.listIterator();
		  it.next();
		  it.next();
		  it.previous();
		  it.set("XX");
		  System.out.println(list);
	}
}
