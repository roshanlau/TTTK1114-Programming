import java.util.*;
import java.text.DecimalFormat;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int total = 0;
		int numStudent = sc.nextInt();
		int[] countGrade = { 0, 0, 0, 0, 0, 0 };
		double maxMark = 0.00;
		double minMark = 100.00;
		int countHighest = 0;
		int countLowest = numStudent;
		String[] grade = { "GRADE A", "GRADE B", "GRADE C", "GRADE D", "GRADE E" };

		for (int j = 0; j < numStudent; j++) {
			double average = 0;
			total = 0;
			for (int i = 0; i < 3; i++) {

				int mark = sc.nextInt();

				total += mark;
			}
			average = total / 3.0;
			if (average <= 100 && average >= 0) {
				if (maxMark < average) {
					maxMark = average;
				}
				if (minMark > average) {
					minMark = average;
				}
			}

			if (average > 100) {
				countGrade[5]++;
			} else if (average >= 80) {
				countGrade[0]++;
			} else if (average >= 60) {
				countGrade[1]++;
			} else if (average >= 40) {
				countGrade[2]++;
			} else if (average >= 30) {
				countGrade[3]++;
			} else if (average >= 0) {
				countGrade[4]++;
			} else {
				countGrade[5]++;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (countGrade[i] > countGrade[countHighest]) {
				countHighest = i;
			}
			if (countGrade[4 - i] <= countGrade[countLowest]) {
				countLowest = 4 - i;
			}
		}

		System.out.println("HIGHEST MARK: " + df.format(maxMark));
		System.out.println("LOWEST MARK: " + df.format(minMark));
		System.out.println("MOST OBTAIN: " + grade[countHighest]);
		System.out.println("LEAST OBTAIN: " + grade[countLowest]);
	}

}
