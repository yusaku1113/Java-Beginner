import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);
        String resultAge;
        String resultGender;
        System.out.println("gender:" + gender);
        System.out.println("age:" + age);
        switch (age) {
            case 0, 1, 2, 3 -> {
                resultAge = "baby";
            }
            case 4, 5 -> {
                resultAge = "child";
            }
            case 18, 19, 20 -> {
                resultAge = "adult";
            }
            default -> {
                resultAge = "kid";
            }
        }
        switch (gender) {
            case 0 -> {
                resultGender = "男";
            }
            default -> {
                resultGender = "女";
            }
        }
        System.out.println("あなたは" + resultAge + "な" + resultGender + "です");
    }
}
