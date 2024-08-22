public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice orange = new Juice("バヤリース", "オレンジ", 130);
        Juice lemon = new Juice("午後の紅茶", "レモンティー", 150);
        Coffee boss = new Coffee("ボス", "控えめ", "無し", 110);
        Coffee georgia = new Coffee("ジョージア", "甘め", "入り", 120);
        orange.buyDrink();
        lemon.buyDrink();
        boss.buyDrink();
        georgia.buyDrink();

    }
}
