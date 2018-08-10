import java.util.Scanner;

public class FindGreatestCommonDivisorDemo {
    public static void main(String[] args) {
        // nhập vào 2 số
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b:");
        int b = scanner.nextInt();

        //Tính giá trị tuyệt đối
        a = Math.abs(a);
        b = Math.abs(b);
    }
}
