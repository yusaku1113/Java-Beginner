import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        System.out.println("整数を入力してください。");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num % 2;

        System.out.println(switch (result) {
            case 0 -> "even";
            default -> "odd";
        });
        sc.close();
    }

}
