import java.util.*;

public class pln2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//read data 
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int meow_total = 0, miau_total = 0, meow_i = 0, miau_i = 0, total = 0;
		int[] meow = new int[n];
		int[] miau = new int[n];
		
		for(int i = 0; i < n; i++) {
			meow[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++) {
			miau[i] = sc.nextInt();
		}
		Arrays.sort(meow);
		Arrays.sort(miau);
		
		if (x + y == n) {
			for(int i =0; i < x; i++) {
				meow_total += meow[(meow.length-1) - i];
			}
			for(int i =0; i < y; i++) {
				miau_total += miau[(miau.length-1) - i];
			}
			System.out.println(meow_total + miau_total);
		}else {
			for(int i = 0; i < n; i++) {
				if(meow[(meow.length-1) - meow_i] > miau[(miau.length-1) - miau_i]) {
					if (meow_i < x) {
						total += meow[(meow.length-1) - meow_i];
						meow_i++;
					}else {
						total += miau[(miau.length-1) - miau_i];
						miau_i++;
					}
				}else {
					if (miau_i < y) {
						total += miau[(miau.length-1) - miau_i];
						miau_i++;
					}else{
						total += meow[(meow.length-1) - meow_i];
						meow_i++;
					}
				}
			}
			System.out.println(total);
		}
		
		
	}

}
