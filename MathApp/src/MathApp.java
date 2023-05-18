import java.util.*;

public class MathApp {
    public static void main (String[] arg){
    	Scanner sc = new Scanner(System.in);
    	Math math = new Math();
        
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int i = sc.nextInt();
    	
    	System.out.println(math.add(n, m));
    	System.out.println(math.add(n, m, i));
        
    }
}