import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot nam: ");
		
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print(year + " la nam nhuan");
		} else {
			System.out.print(year + " khong la nam nhuan");
		}
	}
}