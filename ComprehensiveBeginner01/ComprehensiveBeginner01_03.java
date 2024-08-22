import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random ran = new Random();
        int man = ran.nextInt(3) + 1;
        int woman = ran.nextInt(3) + 1;
        int child = ran.nextInt(3) + 1;
        System.out.println("man:" + man);
        System.out.println("woman:" + woman);
        System.out.println("child:" + child);

        if ((man + woman + child) % 3 == 0) {
            System.out.println("あいこです");
        } else if ((man + woman + child) % 3 == 1) {
            if (woman == child) {
                System.out.println("manが勝ちました");
            } else if (child == man) {
                System.out.println("womanが勝ちました");
            } else if (man == woman) {
                System.out.println("childが勝ちました");
            }
        } else if ((man + woman + child) % 3 == 2) {
            if (woman == child) {
                System.out.println("womanとchildが勝ちました");
            } else if (child == man) {
                System.out.println("manとchildが勝ちました");
            } else if (man == woman) {
                System.out.println("manとwomanが勝ちました");
            }
        }

    }
}
