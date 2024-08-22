import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {
        try {
            int num = new Random().nextInt(2);
            String z = null;
            int result = (1 / num);
            System.out.println(num);
            System.out.println(z.length());
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬルポをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }
}
