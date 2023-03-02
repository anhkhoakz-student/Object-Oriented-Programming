import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	// Create a scanner project

		System.out.print("Nhap vao chieu cao: ");
		double height = sc.nextDouble();

		System.out.print("Nhap vao do dai day: ");
		double base = sc.nextDouble();

		double area = 0.5 * base * height;
		
		System.out.println("Dien tich = " + area);
	}
}