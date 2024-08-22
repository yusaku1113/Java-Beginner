import java.util.*;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map;
        map = new HashMap<Integer, String>();
        map.put(0, "グー");
        map.put(1, "チョキ");
        map.put(2, "パー");
        while (true) {
           
            int num = -1;
            while (num > 2 || num < 0) {
                System.out.println("0:グー 1:チョキ 2:パー ＞数字を入力してください");
                num = sc.nextInt();
                if (num > 2 || num < 0) {
                    System.out.println("エラー: 0, 1, 2のいずれかの数字を入力してください。");
                }
            }
            

            Random ran = new Random();
            int com = ran.nextInt(3);
            System.out.println("あなた:" + map.get(num));
            System.out.println("コンピュータ:" + map.get(com));

            if (num == com) {

                System.out.println("あいこです");
            } else {
                if (num == 0 && com == 1 || num == 1 && com == 2 || num == 2 && com == 0) {
                    System.out.println("あなたの勝ちです。");
                } else {
                    System.out.println("コンピュータの勝ちです。");
                }
                break;

            }
        }
        sc.close();
    }
}