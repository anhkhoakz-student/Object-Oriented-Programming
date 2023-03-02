import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai13 {
    public static String isPalindrome(int n) {
        int dao = 0;
        int num = n;
        while (n != 0) {
            int temp = n % 10;
            dao = dao * 10 + temp;
            n /= 10;
        }
        if (num == dao) {
            return "Day la mot chuoi xuoi nguoc deu giong nhau";
        } else {
            return "Day khong phai la mot chuoi xuoi nguoc deu giong nhau";
        }
    }



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		
        System.out.println(isPalindrome(n));
	}
}