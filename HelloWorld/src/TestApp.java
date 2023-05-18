class test1{
	public test1() {
		System.out.print("test1");
	}
}
class test2 extends test1{
	public test2() {
		System.out.print("test2");
	}
}
class test3 extends test2{
	public test3() {
		System.out.print("test3");
	}
}
public abstract class TestApp {

	public static void main(String[] args) {
		test3 test = new test3();

	}

}
