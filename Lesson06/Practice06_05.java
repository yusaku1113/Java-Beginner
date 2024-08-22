class Practice06_05 {
    public static void main(String[] args) {
        int a;
        int b;
        a = 7 + 6;
        b = 15 - 4;

        System.out.println("a=" + a + "," + "b=" + b);

        a++;
        b--;

        System.out.println("a=" + a + "," + "b=" + b);

        a = a %= 3;
        b = b * 5;
        System.out.println("a=" + a + "," + "b=" + b);

    }

}
