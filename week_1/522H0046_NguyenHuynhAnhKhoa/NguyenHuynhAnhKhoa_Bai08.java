import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai08 {
	public static int tongTu1denN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static double tichTu1denN(int n) {
		double tich = 1;
		for (int i = 1; i <= n; i++) {
			tich *= i;
		}
		return tich;
	}

	public static long motDen2MuN(int n) {
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += Math.pow(2, i);
		}
		return sum;
	}

	public static double motPhan2muN (int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (double) 1/(2*i);
		}
		return sum;
	}	

	public static int tongIMu2DenN (int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		
		System.out.println("a. S = 1 + 2 + 3 + ... + " + n + " = " + tongTu1denN(n));
		System.out.println("b. S = 1 x 2 x 3 x ... x " + n + " = " + tichTu1denN(n));
		System.out.println("c. S = 2^0 + 2^1 + 2^2 + ... + 2^n = " + motDen2MuN(n));
		System.out.println("d. S = 1/2 + 1/4 + 1/6 + ... + 1/2n = " + motPhan2muN(n));
		System.out.println("e. S = " + tongIMu2DenN(n));
	}
}