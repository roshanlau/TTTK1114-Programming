import java.time.Clock;
import java.util.Queue;


public class Vchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Character> vChar = new Queue<Character>();
		String text = " I love to learn TK1143 Program Design !";
		
		for(int i = 0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vChar.add(c);
				
		}
	}

}
