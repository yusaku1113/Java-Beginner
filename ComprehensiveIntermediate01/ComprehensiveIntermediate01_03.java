import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        System.out.println("係数を入力してください");
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        System.out.print("c=");
        int c = sc.nextInt();
        int result = b * b - 4 * a * c;
        if (result < 0) {
            System.out.println("虚数解");
        } else if (result == 0) {
            System.out.println("重解");
        } else {
            System.out.println("実数");
        }
        sc.close();
    }
}
