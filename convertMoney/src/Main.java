import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD muốn đổi: ");
        usd = sc.nextDouble();
        double rate = usd * 23000;
        System.out.println("Giá trị quy đổi ra VND là: " + rate);
    }
}
