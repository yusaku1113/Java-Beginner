import java.util.Random;

public class Practice10_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);
        System.out.println("値：" + gender);
        switch (gender) {
            case 0 -> {
                System.out.println("あなたは男です");
            }
            default -> {
                System.out.println("あなたは女です");
            }
        }

    }
}
