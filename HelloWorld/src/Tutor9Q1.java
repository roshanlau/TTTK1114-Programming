import java.io.*;
import java.util.*;

public class Tutor9Q1 {

	public static char getGrade(int mark) {
		char grade;
		if (mark >= 80) {
			grade = 'A';
		} else if (mark >= 70) {
			grade = 'B';
		} else if (mark >= 60) {
			grade = 'C';
		} else if (mark >= 50) {
			grade = 'D';
		} else {
			grade = 'R';
		}
		return grade;
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("inMarks.txt"));
			FileWriter fw = new FileWriter("outMarks.txt");
			PrintWriter pw = new PrintWriter(fw);

			while (input.hasNext()) {
				String name = input.next();
				String matrikNum = input.next();
				int mark = input.nextInt();
				char grade = getGrade(mark);

				pw.println("Name : " + name);
				pw.println("Matric : " + matrikNum);
				pw.println("Mark : " + mark);
				pw.println("Grade : " + grade);
				pw.println();
			}
			pw.close();
			System.out.println("Output File Completed.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
	}
}
