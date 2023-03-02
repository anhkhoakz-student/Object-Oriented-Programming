// Vi du 1
/*
public class myFirstProgram {
	public static void main (String[] args) {
		System.out.println("Hello World!");
	}
}
*/

// Vi du 2
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int a = 5, b = 10;
		int sum = a + b;
		System.out.println(a + " + " +  b + " = " + sum);
	}
}
*/

// Vi du 3
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum = " + sum);
	}
}
*/

// Vi du 4
/*
public class myFirstProgram {
	public static void main (String[] args ) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}
}
*/

// Vi du 5
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("Sum = " + sum);
	}
}
*/

// Vi du 6
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int x = 12;
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}
}
*/

// Vi du 7
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int x = 11, y = 12;
		if (x < y && x + y >= 10) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
*/

// Vi du 8
/*
public class myFirstProgram {
	public static int findMax(int a, int b) {
		return a > b ? a : b;
	}
	public static void main(String[] args) {
		int x = 5, y = 6;
		System.out.println("Max is " + findMax(x, y));
	}
}
*/

// Vi du 9
/*
public class myFirstProgram {
	public static void main(String[] args) {
		System.out.print("Hello! ");
		System.out.print("Hello! ");
		System.out.print("Hello! ");
	}
}
*/

// Vi du 10
/*
public class myFirstProgram{
	public static void main(String[] args) {
		System.out.println("Hello! ");
		System.out.println("Hello! ");
		System.out.println("Hello! ");
	}
}
*/

// Vi du 11
/*
public class myFirstProgram {
	public static void main(String[] args) {
		int x = 100;
		System.out.printf("Printing simple" + " integer: x = %d\n", x);
		System.out.printf("Formatted with" + " precision: PI = %.2f\n", Math.PI);

		float n = 5.2f;
		System.out.printf("Formatted to " + "specific width: n = %.4f\n", n);
		
		n = 2324435.3f;
		System.out.printf("Formatted to " + "right margin: n = %20.4f\n", n);
	}
}
*/

// Vi du 12
/*
import java.util.Scanner;

public class myFirstProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create a scanner project
		
		String name = sc.nextLine(); // Read user's input
		int age = sc.nextInt();

		System.out.println("Name: " + name); // Print user's input
		System.out.println("Age: " + age);
	}
}
*/

// Bai 1
/*
import java.util.Scanner;

public class myFirstProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	// Create a scanner project

		System.out.print("Nhap vao ten: ");
		String name = sc.nextLine();

		System.out.print("Nhap vao ngay sinh: ");
		int day= sc.nextInt();

		System.out.print("Nhap vao ma so sinh vien: ");
		String mssv = sc.nextLine();

		System.out.println("Ten: " + name);
		System.out.println("Ngay sinh: " + day);
		System.out.println("Ma so sinh vien: " + mssv);
	}
}
*/

// Bai 2
/*
import java.util.Scanner;

public class myFirstProgram {
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
*/

// Bai 3
/*
import java.util.Scanner;

public class myFirstProgram {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	// Create a scanner project

		System.out.print("Nhap vao so 1: ");
		int n1 = sc.nextInt();

		System.out.print("Nhap vao so 2: ");
		int n2 = sc.nextInt();

		int remainder = n1 % n2;
		
		System.out.println("So du = " + remainder);
	}
}
*/

// Bai 4
/*
import java.util.Scanner;

public class myFirstProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so do C: ");
		double c_temp = sc.nextDouble();
		
		double f_temp = (9/5) * c_temp + 32;

		System.out.print("Nhiet do F: " + f_temp);
	}
}
*/

import java.util.Scanner;

public class myFirstProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot nam: ");
		
		String year = sc.nextString();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print(year + " la nam nhuan");
		} else {
			System.out.print(year + " khong la nam nhuan");
		}

		
	}
}

