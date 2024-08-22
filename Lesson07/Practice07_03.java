import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数");
        int inputNum = sc.nextInt();

        System.out.println(inputNum + "を３で割ったあまりは" + inputNum % 3 + "です");
        sc.close();

    }

}
