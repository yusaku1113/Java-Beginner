import java.util.*;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        String begin = "";
        System.out.println("ゾロ目で大当たり！チャンスは30回");
        Scanner sc = new Scanner(System.in);
        while (!begin.equals("begin")) {
            System.out.println("beginと入力してください");
            begin = sc.nextLine();
        }
        sc.close();
        Random ran = new Random();
        for (int i = 1; i < 31; i++) {
            int a = ran.nextInt(10);
            int b = ran.nextInt(10);
            int c = ran.nextInt(10);

            System.out.println(i + "回目：" + a + b + c);
            if (a == b && b == c) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break;
            } else if (i >= 30 && a != b) {
                System.out.println("残念でした。終わります。");
            }

        }

    }

}
