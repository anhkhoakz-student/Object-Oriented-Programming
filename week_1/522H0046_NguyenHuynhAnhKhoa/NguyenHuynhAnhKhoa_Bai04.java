import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao nhiet do C: ");
		double c_temp = sc.nextDouble();
		
		double f_temp = (9/5) * c_temp + 32;

		System.out.println("Nhiet do F: " + f_temp);
	}
}