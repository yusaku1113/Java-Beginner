public class Coffee extends Drink {
    String sweetness;
    String milk;

    Coffee(String brand, String sweetness, String milk, int cost) {
        super(brand, "coffee", cost);
        this.sweetness = sweetness;
        this.milk = milk;
    }

    void buyDrink() {
        System.out.println(brand + "の甘さは" + sweetness + "、ミルク" + milk + "です。" + cost + "円になります。");
    }

}
