import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        int fee = 0;
        System.out.println("人数を入力してください");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 5) {
            fee = 600;
        } else if (num < 19) {
            fee = 550;
        } else {
            fee = 500;
        }
        int sum = num * fee;
        System.out.println("入場料：" + sum);
        sc.close();
    }
}
