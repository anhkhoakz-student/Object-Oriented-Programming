import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so thu 1: ");
		int n1 = sc.nextInt();

		System.out.print("Nhap vao so thu 2: ");
		int n2 = sc.nextInt();

		System.out.print("Nhap vao so thu 3: ");
		int n3 = sc.nextInt();

		int m = n1;
		
		if (n2 < m){
			m = n2;
		}		
		if (n3 < m){
			m = n3;
		}
		System.out.print("So nho nhat la: " + m);
	}
}