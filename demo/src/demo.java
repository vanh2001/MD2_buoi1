import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //Nhập vào từ bàn phím
        //Tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        //Cho phép nhập vào số
        int a = scanner.nextInt();
        //Cho phép nhập chuỗi
        String a1 = scanner.nextLine();

        //hiển thị dữ liệu
        System.out.println("Hello World " + a1);
    }
}
