import java.util.Random;

public class Practice10_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(5) + 1;
        System.out.println("color:" + color);
        System.out.print("今日のラッキーカラーは");
        System.out.print(
                switch (color) {
                    case 1 -> "ピンクです";
                    case 2, 3, 4 -> "レッドです";
                    default -> "ゴールドです";
                });
    }
}
