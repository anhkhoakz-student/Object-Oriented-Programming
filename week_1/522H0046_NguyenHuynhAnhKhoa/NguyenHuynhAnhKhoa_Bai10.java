import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai10 {
	

	public static int tongSoDau_soCuoi (int n) {
		int soCuoi = n % 10;
        int soDau = 0;
        while (n != 0) {
            soDau = n % 10;
            n /= 10;
        }
        int sum = soDau + soCuoi;
        return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		
		System.out.println("Tong so dau va so cuoi = " + tongSoDau_soCuoi(n));
	}
}