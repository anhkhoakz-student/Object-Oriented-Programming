import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print ("Nhap vao mot so: ");
        int n = sc.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                System.out.print(n + " is even, so we take n / 2 : ");
                n /= 2;
                System.out.println(n);
            } else if (n % 2 != 0) {
                System.out.print(n + " is odd, so we take 3 * n + 1 : ");
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
    }
}