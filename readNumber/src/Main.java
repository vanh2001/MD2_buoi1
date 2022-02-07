import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        String strings;
        if(number > 0 && number < 10){
            switch (number){
                case 1:
                    strings = "One";
                    break;
                case 2:
                    strings = "Two";
                    break;
                case 3:
                    strings = "Three";
                    break;
                case 4:
                    strings = "Four";
                    break;
                case 5:
                    strings = "Five";
                    break;
                case 6:
                    strings = "Six";
                    break;
                case 7:
                    strings = "Seven";
                    break;
                case 8:
                    strings = "Eight";
                    break;
                case 9:
                    strings = "Nine";
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }
        }else {

        }
    }
}
