import java.util.Random;

class Practice08_02 {
    public static void main(String[] args) {
        Random ran = new Random();
        int age = ran.nextInt(21);
        if (age <= 3) {
            System.out.println("3以下の場合");
            System.out.println("あなたはbabyです");
        } else if (age < 18) {
            System.out.println("3より大きく、18未満の場合");
            System.out.println("あなたはkidです");
        } else {
            System.out.println("18以上の場合");
            System.out.println("あなたはadultです");
        }
    }

}
