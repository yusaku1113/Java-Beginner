import java.util.Random;

class Practice09_03 {
    public static void main(String[] args) {

        Random ran = new Random();

        for (int X = 1; X <= 10; X++) {
            int num = ran.nextInt(6) + 1;
            if (num % 2 == 1) {
                System.out.println(X + "回目、" + num + "が出ました");
            }
        }

    }
}