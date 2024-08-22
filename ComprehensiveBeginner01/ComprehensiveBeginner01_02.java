import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Random ran = new Random();

        int sum = 0;
        for (int i = 0; i <= 11; i++) {
            int num = ran.nextInt(100) + 1;
            sum += num;
            System.out.println("入力された値" + num);

            if (sum >= 100) {
                break;
            }

        }
        System.out.println("合計値" + sum);

    }

}
