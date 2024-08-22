import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        System.out.println("3つの整数を入力してください");
        Scanner sc = new Scanner(System.in);
        System.out.println("1つめの整数");
        int num1 = sc.nextInt();
        System.out.println("2つめの整数");
        int num2 = sc.nextInt();
        System.out.println("3つめの整数");
        int num3 = sc.nextInt();
        boolean order = (num1 <= num2 && num2 <= num3);
        if (order) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        sc.close();
    }
}
