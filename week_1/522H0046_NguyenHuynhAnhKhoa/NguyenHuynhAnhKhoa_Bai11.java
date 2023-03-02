import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai11 {
	

	public static int countDigit (int n) {
		int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		
		System.out.println("So ky tu = " + countDigit(n));
	}
}