import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao ten: ");
		String name = sc.nextLine();

		System.out.print("Nhap vao ngay sinh: ");
		int day= sc.nextInt();
		sc.nextLine();

		System.out.print("Nhap vao ma so sinh vien: ");
		String mssv = sc.nextLine();

		System.out.println("Ten: " + name);
		System.out.println("Ngay sinh: " + day);
		System.out.println("Ma so sinh vien: " + mssv);
	}
}