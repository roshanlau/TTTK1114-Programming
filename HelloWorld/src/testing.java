import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        
        Scanner Roshan = new Scanner(System.in);
        double sum = 0, BMI = 0, avg = 0;
        
        System.out.print("Enter a number of Students = ");
        int num = Roshan.nextInt();
        
        for (int i = 0; i < num; i++)
        {
            System.out.println("Enter weight and height for Student " + (i + 1) + ": ");
            System.out.println("\nWeight (lbs) = ");
            double lbs = Roshan.nextDouble();
            System.out.println("Height (In) = ");
            double In = Roshan.nextDouble();
            
            BMI = ((lbs * 703) / (In * In));
            sum += BMI;
        }
        
        avg = sum / num;
        System.out.println("Average BMI for this class is : %.2d" + avg);
        
    }

}
