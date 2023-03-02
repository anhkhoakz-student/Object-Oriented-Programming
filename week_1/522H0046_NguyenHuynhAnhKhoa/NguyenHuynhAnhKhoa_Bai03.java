import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	// Create a scanner project

		System.out.print("Nhap vao so 1: ");
		int n1 = sc.nextInt();

		System.out.print("Nhap vao so 2: ");
		int n2 = sc.nextInt();

		int remainder = n1 % n2;
		
		System.out.println("So du = " + remainder);
	}
}