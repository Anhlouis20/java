package Day01;
import java.util.Scanner;
public class demo4 {
    public static void main(String[] args) {
        // khai báo biến 
        int a, b;
        // khởi tạo dữ liệu
        Scanner sc = new Scanner(System.in);
        // thông báo nhập biến a
        System.out.println("Nhap so nguyen  a");
        a = sc.nextInt();
        // thông báo nhập biến b
        System.out.println("Nhap so nguyen b");
        b = sc.nextInt();
        // khai báo biến và tính tổng từ a + b
        int cong = a + b;
        int tru = a - b;
        int nhan = a * b;
        int chia = a / b;

        // thông báo kết quả
        System.out.println("Tổng của"+a+" và "+b+" là: "+cong);
        System.out.println("Tổng của"+a+" và "+b+" là: "+tru);
        System.out.println("Tổng của"+a+" và "+b+" là: "+nhan);
        System.out.println("Tổng của"+a+" và "+b+" là: "+chia);
    }
}