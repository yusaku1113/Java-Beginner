import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        System.out.print("何段>");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        if (inputNum < 0 || inputNum > 5) {
            System.out.println("1 ~ 5 までの整数を入力してください");
        } else {
            for (int i = 1; i <= inputNum; i++) {
                for (int j = 0; j < inputNum - i; j++) {
                    System.out.print(" ");

                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}