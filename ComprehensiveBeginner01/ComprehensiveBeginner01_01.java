import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("3つの整数を入力してください");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "番目の整数");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    i + 1 + "番目の要素の値は" + arr[i] + "で、2倍にすると" + arr[i] * 2 + "になり、3で割ったあまりは" + arr[i] % 3 + "です");
        }

        sc.close();

    }
}