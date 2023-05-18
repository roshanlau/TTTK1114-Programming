import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Tutor9Q2 {
	public static double getBMI(double height, double weight) {
		double BMI = 0.0;

		BMI = weight / (height * height);

		return BMI;
	}

	public static String getStatus(double BMI) {
		String status;

		if (BMI > 30) {
			status = "Obese";
		} else if (BMI > 25) {
			status = "Overweight";
		} else if (BMI > 18.5) {
			status = "Normal";
		} else {
			status = "Underweight";
		}

		return status;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		try {
			Scanner input = new Scanner(new File("inBMI.txt"));
			FileWriter fw = new FileWriter("outBMI.txt");
			PrintWriter pw = new PrintWriter(fw);

			while (input.hasNext()) {
				String name = input.next();
				double height = input.nextDouble();
				double weight = input.nextDouble();
				double BMI = getBMI(height, weight);
				String status = getStatus(BMI);

				pw.println("Name : " + name);
				pw.println("Height : " + height);
				pw.println("Weight : " + weight);
				pw.println("BMI : " + df.format(BMI));
				pw.println("Status : " + status);
				pw.println();

			}
			pw.close();
			System.out.println("Output File Completed");
		} catch (IOException e) {
			System.out.println("An error occurred");
		}
	}
}
