package Day01;
import java.util.Scanner;
public class demooai1 {
    public static void main(String[] args) {
        // khai báo biến 
        int a;
        // khởi tạo dữ liệu
        Scanner sc = new Scanner(System.in);
        // thông báo nhập biến a
        System.out.println("Nhap so nguyen  a");
        a = sc.nextInt();
        int tong = a * a;
        // thông báo kết quả
        System.out.println("Binh phuong cua "+a+" la: "+tong);
    }
}