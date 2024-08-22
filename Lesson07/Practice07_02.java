import java.util.Scanner;

class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "SJIS");
        System.out.println("名前");
        String st = sc.nextLine();
        System.out.println("MLBで二刀流として活躍している日本人野球選手は" + st + "です");
        sc.close();

    }
}
