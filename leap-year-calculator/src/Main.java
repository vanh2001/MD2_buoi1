import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDivisionBy4 = year % 4 == 0;
        if(isDivisionBy4){
            boolean isDivisionBy100 = year % 100 == 0;
            if (isDivisionBy100){
                boolean isDivisionBy400 = year % 400 == 0;
                if (isDivisionBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
