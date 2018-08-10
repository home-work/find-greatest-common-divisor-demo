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

        //Tìm ước chung lớn nhất
        if (a == 0 && b == 0) {
            System.out.println("Không có UCLN");
        } else if (a == 0 && b != 0) {
            System.out.println("UCLN là: " + b);
        } else if (a != 0 && b == 0) {
            System.out.println("UCLN là: " + a);
        } else {
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            System.out.println("UCLN là : " + a);
        }
    }
}
