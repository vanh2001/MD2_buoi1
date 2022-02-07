import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        //Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Width: ");
        width = scanner.nextFloat();

        System.out.printf("Enter Height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
