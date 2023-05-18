class Data{
	int x = 0, y = 0;
	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class TestClass {
	
	public static void main(String[] args) {
		Data d = new Data(1,1);
		 d = new Data(2,2);
		 System.out.print(d.x);
	}

}
