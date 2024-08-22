import java.util.Random;

public class Practice10_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        System.out.println("age:" + age);
        switch (age) {
            case 0, 1, 2, 3 -> {
                System.out.println("あなたはbabyです");
            }
            case 18, 19, 20 -> {
                System.out.println("あなたはadultです");
            }
            default -> {
                System.out.println("あなたはkidです");
            }
        }

    }
}
