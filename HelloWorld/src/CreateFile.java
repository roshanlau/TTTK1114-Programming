import java.io.*;

public class CreateFile {
	public static void main(String[] args) throws IOException {

		File file = new File("filename.txt");
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}
	}
}
