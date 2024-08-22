import java.util.Scanner;

class Practice11_04 {
    public static void main(String[] args) {
        int inputNum = 0;
        Scanner sc = new Scanner(System.in);

        while (inputNum < 1 || inputNum > 5) {
            System.out.println("何段>");
            inputNum = sc.nextInt();

        }
        sc.close();
        int i = 1;
        while (i <= inputNum) {
            int j = 0;
            while (j < inputNum - i) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k < i) {
                System.out.print("*");
                k++;

            }
            System.out.println("");
            i++;

        }

    }

}