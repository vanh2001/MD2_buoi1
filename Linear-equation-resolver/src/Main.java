import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a: ");
        double a = scanner.nextDouble();

        System.out.printf("Enter b: ");
        double b = scanner.nextDouble();

//        System.out.printf("Enter c: ");
//        double c = scanner.nextDouble();
        if (a != 0){
            if(b == 0){
                System.out.println("Phương trình có nghiệm x = 0");
            }else {
                double answer = -b / a;
                System.out.println("Phương trình có nghiệm duy nhất x = " + answer);
            }
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
