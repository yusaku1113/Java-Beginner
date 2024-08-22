
public class Juice extends Drink {
    Juice(String brand, String type, int cost) {
        super(brand, type, cost);

    }

    void buyDrink() {
        System.out.println(brand + "の" + type + "味です。" + cost + "円になります。");
    }

}
