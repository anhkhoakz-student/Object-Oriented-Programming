import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai12 {
	public static int daoSo(int n) {
    int dao = 0;
    while (n != 0) {
        int temp = n % 10;
        dao = dao * 10 + temp;
        n /= 10;
    }
    return dao;
}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		
		System.out.println("So dao = " + daoSo(n));
	}
}