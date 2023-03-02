import java.util.Scanner;

public class NguyenHuynhAnhKhoa_Bai14 {
    public static void inThongBao() {
        System.out.println("----Menu----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
    }

    public static int nhapLuaChon(Scanner sc) {
        int itemChoice;
        do {
            System.out.println("Please enter the number:");
            itemChoice = sc.nextInt();
            if (itemChoice < 1 || itemChoice > 5) {
                System.out.println("Please enter a valid number!");
            }
        } while (itemChoice < 1 || itemChoice > 5);
        return itemChoice;
    }

    public static void xuLyThanhToan(int itemPrice) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("The price of this item is " + itemPrice + "$, please enter the amount of money:");
            int money = sc.nextInt();
            if (money < itemPrice) {
                System.out.println("Not enough money to buy this item. Please enter again");
            } else {
                int change = money - itemPrice;
                System.out.println("Your change is " + change);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inThongBao();
        int itemChoice = nhapLuaChon(sc);

        switch (itemChoice) {
            case 1:
                xuLyThanhToan(2);
                break;
            case 2:
                xuLyThanhToan(1);
                break;
            case 3:
                xuLyThanhToan(3);
                break;
            case 4:
                xuLyThanhToan(4);
                break;
            default:
                System.out.println("Machine is shutting down...");
                break;
        }
    }
}