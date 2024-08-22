import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) {
        Random ran = new Random();
        int gender = ran.nextInt(2);
        System.out.println(gender);

        System.out.println(gender + "の場合");
        if (gender == 0) {
            System.out.println("あなたは男です");
        } else if (gender == 1) {
            System.out.println("あなたは女です");
        }
    }

}
