import java.util.Random;

class Practice08_04 {
    public static void main(String[] args) {
        Random ran = new Random();
        int color = ran.nextInt(6);
        if (color == 1) {
            System.out.println("1の場合");
            System.out.println("今日のラッキーカラーはピンクです");
        } else if (color == 2 || color == 3 || color == 4) {
            System.out.println("2or3or4の場合");
            System.out.println("今日のラッキーカラーはレッドです");
        } else if (color == 5) {
            System.out.println("5の場合");
            System.out.println("今日のラッキーカラーはゴールドです");
        }

    }

}
