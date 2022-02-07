import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Weight in Kilogram: ");
        weight = scanner.nextDouble();
        System.out.print("Enter Height in meter: ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
