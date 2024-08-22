public class Practice14_01 {
    public static void main(String[] args) {
        try {
            String s1 = null;
            System.out.println(s1.length());
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
            System.out.println("finallyブロックです。");

        } finally {
            System.out.println("処理終了");
        }

    }
}
