package Day01;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        // khai báo biến 
        int a, b;
        // khởi tạo dữ liệu
        Scanner sc = new Scanner(System.in);
        // thông báo nhập biến a
        System.out.println("Nhập số nguyên a");
        a = sc.nextInt();
        // thông báo nhập biến b
        System.out.println("Nhập số nguyên b");
        b = sc.nextInt();
        // khai báo biến và tính tổng từ a + b
        int tong = a + b;
        // thông báo kết quả
        System.out.println("Tổng của"+a+" và "+b+" là: "+tong);
    }
}
