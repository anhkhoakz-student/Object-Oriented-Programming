import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot ky tu: ");
		String input = sc.nextLine();
		
		if ((input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') || (input.charAt(0) >= 'a' && input.charAt(0) <= 'z')) {
			System.out.print(input + " la chu");
		} else if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
			System.out.print(input + " la so");
		} else {
			System.out.println(input + " khong phai chu cai hoac so");
		}
	}
}
